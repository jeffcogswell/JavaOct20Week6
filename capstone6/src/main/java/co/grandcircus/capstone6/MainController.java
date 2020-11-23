package co.grandcircus.capstone6;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@Autowired
	TaskRepository trep;
	
	@Autowired
	TaskuserRepository urep;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/login")
	public String login(Taskuser user, Model model) {
		Taskuser checkUser = urep.findByEmail(user.getEmail()); 
		if (checkUser != null && checkUser.getPassword().compareTo(user.getPassword()) == 0) {
			session.setAttribute("email", checkUser.getEmail());
			session.setAttribute("userid", checkUser.getId());
			return "redirect:/taskpage";
		}
		else {
			model.addAttribute("message", "That email/password does not work. Please try again.");
			return "index";
		}
	}
	
	@PostMapping("/register")
	public String register(Taskuser user, Model model) {
		// Check if email already exists
		
		Taskuser checkUser = urep.findByEmail(user.getEmail()); 
		System.out.println("REGISTER: Checking user");
		System.out.println(checkUser);
		System.out.println(user.getEmail());
		if (checkUser != null) {
			model.addAttribute("message", "That email already exists. Please try a different email or try logging in instead.");
			return "index";
		}
		
		// Register the user
		urep.save(user);
		session.setAttribute("email", user.getEmail());
		session.setAttribute("userid", user.getId());
		return "redirect:/taskpage";
	}
	
	@GetMapping("/taskpage")
	public String taskpage(Model model) {
		
		// Make sure user is logged in. If not, return to index.
		String email = (String)session.getAttribute("email");
		if (email == null) {
			return "redirect:/";
		}
		Taskuser user = urep.findByEmail(email);
		model.addAttribute("user", user);
		return "taskpage";
	}
	
	@GetMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/save")
	public String save(Task task, Model model) {
		String email = (String)session.getAttribute("email");
		if (email == null) {
			return "redirect:/";
		}
		Taskuser checkUser = urep.findByEmail(email);
		task.setTaskuser(checkUser);
		trep.save(task);
		return "redirect:/taskpage";
	}
	
	@GetMapping("/markcomplete")
	public String markcomplete(Long id) {
		// Make sure the logged in user has access to this task
		long userid = (long)session.getAttribute("userid");
		Task task = trep.findById(id).orElse(null);
		System.out.println(userid);
		if (task == null || task.getTaskuser().getId() != userid) {
			System.out.println("MarkComplete: NOT FOUND");
			return "redirect:/taskpage";
		}
		System.out.println("MarkComplete: FOUND");
		task.setComplete(true);
		trep.save(task);
		return "redirect:/taskpage";
	}
	
	@GetMapping("/deletetask")
	public String deletetask(Long id) {
		// Make sure the logged in user has access to this task
		long userid = (long)session.getAttribute("userid");
		Task task = trep.findById(id).orElse(null);
		System.out.println(userid);
		if (task == null || task.getTaskuser().getId() != userid) {
			return "redirect:/taskpage";
		}
		trep.delete(task);
		return "redirect:/taskpage";
	}
	
}

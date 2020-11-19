package co.grandcircus.sessiondemo2;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@Autowired
	private UserRepository urep;
	
	@Autowired
	private FavoritesRepository frep;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/login")
	public String login(String username, String password, Model model) {
		
		System.out.println("LOGIN:");
		System.out.println(username);
		
		User user = urep.findById(username).orElse(null);
		
		if (user == null) {
			// No username found
			return "fail";
		}
		else {
			if (user.getPassword().compareTo(password) == 0) {
				session.setAttribute("user", user);
				return "redirect:/test";
			}
			else {
				return "fail";
			}
		}
		
	}
	
	@GetMapping("/test")
	public String test(Model model) {
		User user = (User)session.getAttribute("user");
		if (user == null) {
			return "redirect:/";
		}
		model.addAttribute("user", user);
		
		List<Favorites> favs = frep.findByUsername(user.getUsername());
		model.addAttribute("favs", favs);
		return "test";
	}
	
	@GetMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/register")
	public String register(User user) {
		urep.save(user);
		session.setAttribute("user", user);
		return "redirect:/test";
	}

	
	
}














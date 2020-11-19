package co.grandcircus.sessiondemo1;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@Autowired
	HttpSession session;
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/login")
	public String login(String username, String password) {
		
		if (username.compareTo("fred") == 0 && password.compareTo("abc123") == 0) {
			session.setAttribute("username", username);
			return "welcome";			
		}
		else {
			return "fail";
		}
		
	}
	
	@GetMapping("/profile")
	public String profile(Model model) {
		String username = (String)session.getAttribute("username");
		model.addAttribute("username", username);
		return "profile";
	}
}

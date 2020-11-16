package co.grandcircus.cardemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {
	
	// This part, "autowired" is called "Dependency Injection"
	@Autowired
	private CarRepository rep;
	/*
	 *  List some of the paths or routes
	 *  "READ"
	 *  1. Page that lists cars "/"
	 *  "CREATE"
	 *  2. Page for typing in new car GET "/add"
	 *  3. Page for add confirmation POST "/add"
	 *  "DELETE"
	 *  4. Page for deleting a car GET "/delete?id=4"
	 *  5. Route that actually deletes the car GET "/reallydelete?id=6"
	 */
	
	@GetMapping("/")
	public String index(Model model) {
		List<Car> cars = rep.findAll();
		System.out.println(cars);
		model.addAttribute("cars", cars);
		return "index";
	}
	
	@GetMapping("/add")
	public String add() {
		return "addform";
	}
	
	@PostMapping("/add")
	public String add(Car car, Model model) {
		System.out.println(car.getModel());
		rep.save(car);
		model.addAttribute("car", car);
		return "addconfirm";
	}
	
	@GetMapping("/delete")
	public String delete(long id, Model model) {
		Car car = rep.findById(id).get();
		model.addAttribute("car", car);
		return "deletepage";
	}
	
	@GetMapping("/reallydelete")
	public String reallydelete(long id) {
		rep.deleteById(id);
		return "redirect:/";
	}
}










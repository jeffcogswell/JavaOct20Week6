package co.grandcircus.joindemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

	@Autowired
	private DepartmentRepository drep;
	
	@Autowired
	private EmployeeRepository erep;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Department> deps = drep.findAll();
		model.addAttribute("departments", deps);
		System.out.println(deps.get(1).getEmployees());
		System.out.println(deps.get(1).getEmployees().get(0).getFirstname());
		return "index";
	}
	
	@GetMapping("/employee")
	public String employee(long id, Model model) {
		Employee emp = erep.findById(id).get();
		model.addAttribute("employee", emp);
		return "employee";
	}
}










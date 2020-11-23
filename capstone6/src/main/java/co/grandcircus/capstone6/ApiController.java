package co.grandcircus.capstone6;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
	
	@Autowired
	TaskForApiRepository trep;
	

	@GetMapping("/api/tasks")
	List<TaskForApi> apitasks() {
		return trep.findAll();
	}
	
	@GetMapping("/api/tasks/{id}")
	TaskForApi apitasks(@PathVariable long id) {
		return trep.findById(id).orElse(null);
	}
	
	
	@GetMapping("/api/tasks/search/{desc}")
	List<TaskForApi> search(@PathVariable String desc) {
		return trep.findByDescriptionContaining(desc);
	}
}

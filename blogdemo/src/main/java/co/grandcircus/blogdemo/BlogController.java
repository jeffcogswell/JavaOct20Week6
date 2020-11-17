package co.grandcircus.blogdemo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
	@Autowired
	private BlogRepository rep;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Blog> blogs = rep.findTop10ByOrderByEntrydateDesc(); //rep.findAll(Sort.by(Sort.Direction.DESC, "entrydate"));
		System.out.println(blogs);
		model.addAttribute("blogs", blogs);
		return "index";
	}
	
	@GetMapping("/detail/{id}")
	public String detail(@PathVariable("id") long id, Model model) {
		System.out.println("DETAIL");
		System.out.println(id);
		Blog blog = rep.findById(id).get();
		model.addAttribute("blog", blog);
		rep.save(blog);
		
		return "detail";
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@GetMapping("/reallydelete")
	public String reallydelete() {
		return "redirect:/";
	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}
	
	/*
	 * The /add and /edit routes use functions that are identical.
	 * We could combine them into a single function and just call it "save"
	 */
	@PostMapping("/add")
	public String add(Blog blog) {
		System.out.println("ADD");
		System.out.println(blog.getEntrydate());
		System.out.println(new java.sql.Timestamp(12345678));
		//blog.setEntrydate(new Date());
		rep.save(blog);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") long id, Model model) {
		Blog blog = rep.findById(id).get();
		model.addAttribute("blog", blog);
		return "edit";
	}
	
	@PostMapping("/edit")
	public String edit(Blog blog) {
		rep.save(blog);
		return "redirect:/";
	}
}








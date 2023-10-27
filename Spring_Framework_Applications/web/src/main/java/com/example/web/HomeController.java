package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("Constructing the HomeController");
	}
	
	@ModelAttribute
	public void other(Model y) {
		System.out.println("Executing HomeController.other");
		y.addAttribute("other", "other data");
		System.out.printf("Model: %s\n", y);
	}
	
	@ModelAttribute
	public void another(Model x) {
		System.out.println("Executing HomeController.another");
		x.addAttribute("another", "another data");
		System.out.printf("Model: %s\n", x);
	}
	
	@GetMapping("/")
	public String index(Model m) {
		System.out.println("Executing HomeController.index");
		
		System.out.printf("Model: %s\n", m);
		m.addAttribute("MyCustomName", "MyCustom data");
		System.out.printf("Model: %s\n", m);
		
		// the string index will be looked for in src/main/resources/templates
		return "index";
	}
	
	@GetMapping("/Task1/{data}")
	public String one(Model m, @PathVariable("data") int dataParameter) {
		System.out.println("Executing HomeController.Task1");
		
		System.out.printf("Model: %s\n", m);
		m.addAttribute("Task1DataParameter", dataParameter);
		System.out.printf("Model: %s\n", m);
		
		// the string index will be looked for in src/main/resources/templates
		return "Task1View";
	}
	
	@GetMapping("/Task2/{data}")
	public String two(Model m, @PathVariable("data") String dataParameter, @RequestParam("Q1") int Q1data) {
		System.out.println("Executing HomeController.Task2");
		
		System.out.printf("Model: %s\n", m);
		m.addAttribute("MyCustomName", "Task2 Name");
		m.addAttribute("Task1DataParameter", dataParameter);
		m.addAttribute("Task2QueryParameter", Q1data);
		System.out.printf("Model: %s\n", m);
		
		// the string index will be looked for in src/main/resources/templates
		return "Task2View";
	}
	
	@GetMapping("/Task3")
	public String three(Model m) {
		System.out.println("Executing HomeController.Task3");
		
		System.out.printf("Model: %s\n", m);
		m.addAttribute("MyCustomName", "Heroes");
		m.addAttribute("heroes", Hero.generateData());
		System.out.printf("Model: %s\n", m);
		
		// the string index will be looked for in src/main/resources/templates
		return "Task3View";
	}
	
	@GetMapping("/beginning/{name}")
	public String beg(Model m, @PathVariable("name") String dataParameter) {
		System.out.println("Executing HomeController.beginning");
		
		System.out.printf("Model: %s\n", m);
		m.addAttribute("beginningDataParameter", dataParameter);
		System.out.printf("Model: %s\n", m);
		
		// the string index will be looked for in src/main/resources/templates
		return "beginning";
	}
	
	@GetMapping("/middle/{animal}")
	public String mid(Model m, @PathVariable("animal") String dataParameter) {
		System.out.println("Executing HomeController.middle");
		
		System.out.printf("Model: %s\n", m);
		m.addAttribute("middleDataParameter", dataParameter);
		System.out.printf("Model: %s\n", m);
		
		// the string index will be looked for in src/main/resources/templates
		return "middle";
	}
	
	@GetMapping("/end/{number}")
	public String end(Model m, @PathVariable("number") String dataParameter) {
		System.out.println("Executing HomeController.end");
		
		System.out.printf("Model: %s\n", m);
		m.addAttribute("endDataParameter", dataParameter);
		System.out.printf("Model: %s\n", m);
		
		// the string index will be looked for in src/main/resources/templates
		return "end";
	}
}

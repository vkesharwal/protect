package com.pyp.protect.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pyp.protect.entities.Helloworld;
import com.pyp.protect.entities.Plans;
import com.pyp.protect.entities.Users;
import com.pyp.protect.services.UserService;

@Controller
public class PageController {

	@Autowired
	private UserService userService;
	/*
	 * @RequestMapping("/") public String home() { return "users"; }
	 */
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("user", new Users());
		return "greeting";
	}
	
	 @GetMapping("/helloworld")
	  public String greetingForm(Model model) {
	    model.addAttribute("helloworld", new Helloworld());
	    return "helloworld";
	  }
	
	 @PostMapping("/helloworld")
	  public String helloSubmit(@ModelAttribute Helloworld helloworld, Model model) {
	    model.addAttribute("hellworld", helloworld);
	    return "result";
	    //return helloworld.toString();
	  }
	 
	 @PostMapping("/greeting")
	  public String greetingSubmit(@ModelAttribute Users user, Model model) {
	    model.addAttribute("user", user);
		
		  user.setId(System.currentTimeMillis()); user.setCreatedDate(new
		  Timestamp(System.currentTimeMillis())); user.setModifiedDate(new
		  Timestamp(System.currentTimeMillis())); user.setStatus("CREATED"); 
		  userService.addUser(user);
		 
	    return "UserCreated";
	    //return helloworld.toString();
	  }
	 
	 @GetMapping("/plans")
	 public String getPlans(@ModelAttribute Plans plan, Model model) {
		    model.addAttribute("plan", plan);
		    return "Plans";
		    //return helloworld.toString();
		  }
	 
	 @PostMapping("/plans")
	  public String postPlan(@ModelAttribute Plans plan, Model model) {
	    model.addAttribute("plan", plan);
	    return "UserCreated";
	    //return helloworld.toString();
	  }
}

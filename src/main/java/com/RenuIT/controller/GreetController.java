package com.RenuIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	@GetMapping("/GreetingMasg")
	public String GreetMas (Model model) {
		
		String msg = "Good Morning To all from RenuIT";
		model.addAttribute("GreetMag", msg);
		
		return "greet";
		
	}

}

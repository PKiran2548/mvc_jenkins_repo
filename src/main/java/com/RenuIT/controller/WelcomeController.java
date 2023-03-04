package com.RenuIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println("Welcome Class Controller Constructor");
	}
	
	
	@GetMapping("/welcomemsg")
	public ModelAndView WelComeMsg () {
		
		String msg = "WelCome In Kirans RenuIT";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MASSAGE", msg);
		mav.setViewName("welcome");
		
		return mav;
		
	}
	

// @Controller Annotation helps to tail the IOC to make bean of this class
}

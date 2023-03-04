package com.RenuIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkController {
	
	@GetMapping("/workcontroller")
	public ModelAndView workcontrole () {
		String msg = "I am Here to controle workflow";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MASSAGE", msg);
		mav.setViewName("work");
		return mav ;
		
	}

}

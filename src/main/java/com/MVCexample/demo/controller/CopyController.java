package com.MVCexample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MVCexample.demo.model.Programmer;

@Controller
public class CopyController {
	
	 // @RequestMapping(value = "/addProgrammer", method=RequestMethod.POST)
	
		/*
		 * @PostMapping("/addProgrammer") public String addprogrammer(@ModelAttribute
		 * Programmer programmer) {
		 * 
		 * return "programmerInfo.html";
		 * 
		 * //ModelAndView mv = new ModelAndView();
		 * //mv.setViewName("programmerInfo.html"); return "programmerInfo.html"; //AMra
		 * ekhane ModelAndView or String jekono ta use korte pari r amra jodi chai tobe
		 * object er nam o amra change korte pari thik @RequestParam er
		 * mato, @ModelAttribute("P") Programmer programmer. }
		 */
	 
}

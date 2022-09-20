package com.MVCexample.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.MVCexample.demo.model.Programmer;
import com.MVCexample.demo.repository.ProgrammerRepo;

@Controller
@ControllerAdvice
public class MainController {
	@Autowired
	ProgrammerRepo pr;
	
	@ModelAttribute
	public void welcome(Model m) {
		m.addAttribute("msg", "Welcome to Spring MVC tutorial"); // @ModelAttribute diye amra ai message take sob gulo view te print korte pari r @ControllerAdvice diye amara ai message take onno controller guloteo print korte pari
		
	}
	
	//@RequestMapping("/home") 
	@GetMapping("/home")
	public String homePage() {
		return "home.html";

	}
	
	
	 @RequestMapping("/addProgrammerInfo") public String addProgrammerInfo() {
	 return "addProgrammerInfo.html"; }
	 
	
	@GetMapping("/allProgrammer")
	public String allProgrammers( Model m) {
		List<Programmer> p = new ArrayList<Programmer>();
		p.add(new Programmer(101,"Himel","Java"));
		p.add(new Programmer(102, "Nilima", "Java"));
		p.add(new Programmer(103, "Katha", "Bangla"));
		
		m.addAttribute("programmers", p);
		
		return "allProgrammers.html";
	}
	
	@RequestMapping("/addProgrammer")
	public String addprogrammer(@ModelAttribute Programmer programmer) {
		
		System.out.println("Himel Bari");
		pr.save(programmer);
	
			
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("programmerInfo.html");
		return "programmerInfo.html";
		// AMra ekhane ModelAndView or String jekono ta use korte pari r amra jodi chai tobe object er nam o amra change korte pari thik @RequestParam er mato, @ModelAttribute("P") Programmer programmer.
	}

	/*
	 * @RequestMapping("/addProgrammer") public String addProgrammer(@RequestParam
	 * int pId, @RequestParam String pName, @RequestParam String pLang, Model model)
	 * { // RequestParam er kaj hocche url request a parameter hisebe je value gulo
	 * ase // setake variable a set kora. // Model or ModelMap use for data
	 * integration, we can use any of them; Method // variable er value ke return
	 * page a pathate help kore. model.addAttribute("pId", pId);
	 * model.addAttribute("pName", pName); model.addAttribute("pLang", pLang);
	 * return "programmerInfo.html"; }
	 */
	
	// ...............................................Example of @ModelAttribute annotation. Eta diye amra data take object akare receive korte pari, 
	//................................................uporer kaj tai amra ebar @ModelAttribute use kore korbo
	
	/*
	 * @RequestMapping("/addProgrammer") public String addprogrammer(@ModelAttribute
	 * Programmer programmer) {
	 * 
	 * //ModelAndView mv = new ModelAndView();
	 * //mv.setViewName("programmerInfo.html");
	 * 
	 * return "programmerInfo.html"; // AMra ekhane ModelAndView or String jekono ta
	 * use korte pari r amra jodi chai tobe object er nam o amra change korte pari
	 * thik @RequestParam er mato, @ModelAttribute("P") Programmer programmer. }
	 */
	
	
	

	// ..............................................................................Example of ModelAndView, amra Model diye je kajta korechi seta ModelAndView
	// dara o korte pari r setar example niche kora holo.
	// @RequestParam("pId") int i, eta diye amra variable er name ta change kore pId
	// theke i te change korechi.

	/*
	 * @RequestMapping("/addProgrammer") public ModelAndView
	 * addprogrammer(@RequestParam("pId") int i, @RequestParam("pName") String
	 * n, @RequestParam("pLang") String l) { ModelAndView mv = new ModelAndView();
	 * 
	 * mv.setViewName("programmerInfo.html");
	 * 
	 * mv.addObject("pId", i); mv.addObject("pName", n); mv.addObject("pLang", l);
	 * 
	 * return mv; }
	 */

}

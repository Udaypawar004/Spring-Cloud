package com.uday.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uday.springmvc.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "aliens");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		
		int num3 = num1 + num2;
		
		mv.addObject("num3", num3);
		
		return mv;
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(@ModelAttribute("a") Alien a) {
		return "result";
	}
}

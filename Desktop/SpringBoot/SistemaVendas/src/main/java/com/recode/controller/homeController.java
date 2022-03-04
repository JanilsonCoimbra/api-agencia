package com.recode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController{
	
	@GetMapping("/")
	public String home(Model model) 
	{	
		model.addAttribute("mensagem", "Ola mundo");
		return "mensagem";
	}
	@GetMapping("/text")
	public String text() {
		return "home";
	}
}

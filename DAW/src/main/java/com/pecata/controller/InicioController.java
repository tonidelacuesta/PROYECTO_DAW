package com.pecata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	@RequestMapping("/index")
	public String inicio(Model modelo) {
		
		
		return "user/home";
	}

}

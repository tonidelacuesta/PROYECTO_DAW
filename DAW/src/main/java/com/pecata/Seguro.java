package com.pecata;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Seguro {
	@RequestMapping("/admin")
	public String admin() {
		return "admin/index";
	}

	@RequestMapping("/registrado")
	public String registrado() {
		return "registrado/inicio";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}

	@RequestMapping(value = "/403")
	public String accesoDenegado(Model modelo) {

		modelo.addAttribute("message", "No tienes permiso de acceso a esta página");
		return "403Page";
	}
}

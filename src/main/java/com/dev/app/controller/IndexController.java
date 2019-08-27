package com.dev.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.app.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping(value = { "/", "/index", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	}

	@GetMapping(value = "/profile")
	public String profile(Model model) {
		User user = new User();
		user.setName("Leonardo");
		user.setLastName("Lucio");
		model.addAttribute("user", user);
		model.addAttribute("titulo", "Perfil de Usuario: ".concat(user.getName()));
		return "profile";
	}
}

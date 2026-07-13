package com.divdev.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.divdev.springboot.di.app.services.MyService;

@Controller
public class IndexController {

	private MyService service;
	
	@Autowired //we can omit this annotation, it is up to you to write it.
	public IndexController(MyService service) {
		this.service = service;
	}

	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("object", service.operation());
		return "index";
	}

	
}

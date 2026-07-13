package com.divdev.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.divdev.springboot.di.app.services.IService;


@Controller
public class IndexController {

	//we can inject: by attribute, by constructor and by method set 
	@Autowired 
	private IService service;
	
	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("object", service.operation());
		return "index";
	}

	
}

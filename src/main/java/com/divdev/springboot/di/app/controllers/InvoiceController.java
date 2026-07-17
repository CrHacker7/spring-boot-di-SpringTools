package com.divdev.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.divdev.springboot.di.app.domain.Invoice;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired
	private Invoice invoice;
	
	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("invoice", invoice);
		model.addAttribute("title", "Invoice example with DI");
		return "invoice/view";
	}
}

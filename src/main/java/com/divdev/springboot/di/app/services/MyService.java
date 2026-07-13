package com.divdev.springboot.di.app.services;

//import org.springframework.stereotype.Component; another option to DI
import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String operation() {
		return "Executing an important process...";
	}
}

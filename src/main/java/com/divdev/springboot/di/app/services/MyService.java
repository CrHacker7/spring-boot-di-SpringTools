package com.divdev.springboot.di.app.services;

import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component; another option to DI
import org.springframework.stereotype.Service;

//@Primary
//@Service("myServiceSimple")
public class MyService implements IService{

	@Override
	public String operation() {
		return "Executing an important SIMPLE process...";
	}
	
}

package com.divdev.springboot.di.app.services;

import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component; another option to DI
import org.springframework.stereotype.Service;

//@Primary
@Service("myServiceComplex")
public class MyServiceComplex implements IService{

	@Override
	public String operation() {
		return "Executing an important COMPLEX process...";
	}
	
}

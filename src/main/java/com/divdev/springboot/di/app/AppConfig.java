package com.divdev.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.divdev.springboot.di.app.services.IService;
import com.divdev.springboot.di.app.services.MyService;
import com.divdev.springboot.di.app.services.MyServiceComplex;

@Configuration
public class AppConfig {

	@Bean("myServiceSimple")
	@Primary
	public IService registerMyService() {
		return new MyService();
	}
	
	@Bean("myServiceComplex")
	public IService registerMyServiceComplex() {
		return new MyServiceComplex();
	}
}

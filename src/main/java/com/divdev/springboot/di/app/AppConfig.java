package com.divdev.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.divdev.springboot.di.app.domain.ItemInvoice;
import com.divdev.springboot.di.app.domain.Product;
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
	
	@Bean("itemsInvoice")
	public List<ItemInvoice> regiterItems(){
		Product product1 = new Product("Camera Sony", 1000);
		Product product2 = new Product("Dron DJI", 500);
		
		ItemInvoice line1 = new ItemInvoice(product1, 2);
		ItemInvoice line2 = new ItemInvoice(product2, 3);
		
		return Arrays.asList(line1, line2);
	}
}

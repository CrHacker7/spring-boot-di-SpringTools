package com.divdev.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
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
	
	@Qualifier("itemsInvoiceOffice")
	@Bean("itemsInvoice")
	public List<ItemInvoice> regiterItems(){
		Product product1 = new Product("Camera Sony", 1000);
		Product product2 = new Product("Dron DJI", 500);
		
		ItemInvoice line1 = new ItemInvoice(product1, 2);
		ItemInvoice line2 = new ItemInvoice(product2, 3);
		
		return Arrays.asList(line1, line2);
	}
	
	@Primary
	@Bean("itemsInvoiceOffice")
	public List<ItemInvoice> regiterItemsOffice(){
		Product product1 = new Product("Monitor Samsung 42", 300);
		Product product2 = new Product("Iphone 17 1Tb", 1500);
		Product product3 = new Product("Macbook Pro 2Tb", 2300);
		Product product4 = new Product("Desk", 300);
		
		ItemInvoice line1 = new ItemInvoice(product1, 2);
		ItemInvoice line2 = new ItemInvoice(product2, 1);
		ItemInvoice line3 = new ItemInvoice(product3, 1);
		ItemInvoice line4 = new ItemInvoice(product4, 1);
		
		return Arrays.asList(line1, line2, line3, line4);
	}
}

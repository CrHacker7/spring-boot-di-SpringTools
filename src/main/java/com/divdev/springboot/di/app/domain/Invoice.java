package com.divdev.springboot.di.app.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope
public class Invoice implements Serializable{

	private static final long serialVersionUID = 725176341956574714L;

	@Value("${invoice.description}")
	private String description;

	@Autowired
	private Client client;

	@Autowired
	private List<ItemInvoice> items;
	
	@PostConstruct
	public void init() {
		client.setName(client.getName().concat(" ").concat("Genious"));
		description = description.concat(" for client: ").concat(client.getName());
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Invoice destroyed: ".concat(description));
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ItemInvoice> getItems() {
		return items;
	}

	public void setItems(List<ItemInvoice> items) {
		this.items = items;
	}

}

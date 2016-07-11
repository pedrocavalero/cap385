package com.pedrocavalero.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String name = "Pedro";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

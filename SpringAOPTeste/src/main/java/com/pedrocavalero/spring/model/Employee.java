package com.pedrocavalero.spring.model;

import org.springframework.stereotype.Component;

import com.pedrocavalero.spring.aspect.Loggable;

@Component
public class Employee {

	private String name = "Teste";
	
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}

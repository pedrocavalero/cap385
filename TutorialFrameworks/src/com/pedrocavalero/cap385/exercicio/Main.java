package com.pedrocavalero.cap385.exercicio;

public class Main {
	
	public static void main(String[] args){
		Product p = new Product("notebook", "HP", 1999.99, 
				"2348203894032948","codigo secreto");
		
		SerializerBuilder builder = new SerializerBuilder();
		Serializer cxs = builder.createPropertiesSerializar().withEncription(1).withLogging().build();
		cxs.generateFile("product.txt", p);
		
	}

}

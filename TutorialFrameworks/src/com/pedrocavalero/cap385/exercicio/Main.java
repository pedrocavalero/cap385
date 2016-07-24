package com.pedrocavalero.cap385.exercicio;

public class Main {
	
	public static void main(String[] args){
		Product p = new Product("notebook", "HP", 1999.99, 
				"2348203894032948","codigo secreto");
		
//		FileSerializer cxs = new FileSerializer(
//				new XMLFormatter(), 
//				new CompositePostProcessor(new Crypto(5), new Compressor()));
//		cxs.generateFile("product.zip", p);
		
		
		FileSerializer cxs = new FileSerializer(new PropertiesFormatter(), new Compressor());
		cxs.generateFile("product.zip", p);
//		
//		FileSerializer sps = new FileSerializer(new XMLFormatter(), new Crypto(5));
//		sps.generateFile("product.txt", p);
		
	}

}

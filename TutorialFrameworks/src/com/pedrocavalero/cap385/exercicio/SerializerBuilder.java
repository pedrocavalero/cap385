package com.pedrocavalero.cap385.exercicio;

public class SerializerBuilder {

	private Serializer serializer;
	
	public SerializerBuilder createXMLSerializar(){
		serializer = new FileSerializer(new XMLFormatter(), new NullPostProcessor());
		return this;
	}
	public SerializerBuilder createPropertiesSerializar(){
		serializer = new FileSerializer(new PropertiesFormatter(), new NullPostProcessor());
		return this;
	}

	public SerializerBuilder withEncription(int number){
		PostProcessor pp = new Crypto(number);
		addPostProcessor(pp);
		return this;
	}
	
	
	public SerializerBuilder withCompression(){
		PostProcessor pp = new Compressor();
		addPostProcessor(pp);
		return this;
	}

	private void addPostProcessor(PostProcessor pp){
		PostProcessor current = serializer.getPostProcessor();
		if(current instanceof NullPostProcessor){
			serializer.setPostProcessor(pp);
		} else {
			CompositePostProcessor cpp = new CompositePostProcessor(current, pp);
			serializer.setPostProcessor(cpp);
		}
	}
	
	public SerializerBuilder withLogging(){
		serializer = new SerializerLogger(serializer);
		return this;
	}
	public Serializer build(){
		return serializer;
	}
}

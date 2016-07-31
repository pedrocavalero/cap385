package com.pedrocavalero.cap385.exercicio;

public class SerializerLogger implements Serializer {

	private Serializer serializer;
	
	public SerializerLogger(Serializer serializer) {
		this.serializer = serializer;
	}

	@Override
	public void generateFile(String filename, Object propGetter) {
		System.out.println("Serializing file "+filename+"...");
		serializer.generateFile(filename, propGetter);
		System.out.println("Serialization for file " +filename+" finished!");
	}

	public void setPostProcessor(PostProcessor postProcessor) {
	}

	public PostProcessor getPostProcessor() {
		return null;
	}

	public void setDataFormatter(DataFormatter dataFormatter) {
	}

	public DataFormatter getDataFormatter() {
		return null;
	}

}

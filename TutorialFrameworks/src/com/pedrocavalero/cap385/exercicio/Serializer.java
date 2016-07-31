package com.pedrocavalero.cap385.exercicio;

public interface Serializer {

	void generateFile(String filename, Object propGetter);

	void setPostProcessor(PostProcessor postProcessor);

	PostProcessor getPostProcessor();

	void setDataFormatter(DataFormatter dataFormatter);

	DataFormatter getDataFormatter();

}
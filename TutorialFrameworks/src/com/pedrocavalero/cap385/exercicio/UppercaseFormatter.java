package com.pedrocavalero.cap385.exercicio;

import java.lang.annotation.Annotation;

public class UppercaseFormatter implements ValueFormatter {

	@Override
	public Object formatValue(Object value) {
		return value.toString().toUpperCase();
	}

	@Override
	public void readAnnotation(Annotation an) {
	}

}

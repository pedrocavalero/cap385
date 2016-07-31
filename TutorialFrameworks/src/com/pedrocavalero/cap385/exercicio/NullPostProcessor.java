package com.pedrocavalero.cap385.exercicio;

import java.io.IOException;

public class NullPostProcessor implements PostProcessor {

	@Override
	public byte[] postProcess(byte[] bytes) throws IOException {
		return bytes;
	}

}

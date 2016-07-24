package com.pedrocavalero.cap385.exercicio;

import java.io.IOException;

public interface PostProcessor {

	byte[] postProcess(byte[] bytes) throws IOException;

}

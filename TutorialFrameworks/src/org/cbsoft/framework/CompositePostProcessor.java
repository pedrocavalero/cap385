package org.cbsoft.framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositePostProcessor implements PostProcessor {

	private List<PostProcessor> processors = new ArrayList<PostProcessor>();
	
	public CompositePostProcessor(PostProcessor...postProcessors) {
		processors.addAll(Arrays.asList(postProcessors));
	}
	
	@Override
	public byte[] postProcess(byte[] bytes) throws IOException {
		for (PostProcessor postProcessor : processors) {
			bytes = postProcessor.postProcess(bytes);
		}
		return bytes;
	}

}

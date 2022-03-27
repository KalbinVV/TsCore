package org.kalbinvv.tscore.test;

import java.io.Serializable;
import java.util.List;

public class Answer implements Serializable{

	private static final long serialVersionUID = -2544119379592911355L;
	private final List<String> variants;
	
	public Answer(List<String> variants) {
		this.variants = variants;
	}

	public List<String> getVariants() {
		return variants;
	}
	
	@Override
	public String toString() {
		return "Answer{"
				+ "variants='" + variants + "'"
				+ "}";
	}
	
}

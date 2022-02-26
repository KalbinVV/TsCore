package org.kalbinvv.tscore.test;

import java.util.List;
public interface Question {

	public String getTitle();
	public QuestionType getType();
	public List<String> getVariants();
	public List<String> getUserSelect();
	public void render();
	
}

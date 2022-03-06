package org.kalbinvv.tscore.test;

import java.util.List;

public interface Test{

	public List<Question> getQuestions();
	public String getName();
	public String getDescription();
	public int getCurrentQuestion();
	public void setCurrentQuestion(int currentQuestion);
	
}

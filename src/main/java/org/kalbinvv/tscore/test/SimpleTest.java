package org.kalbinvv.tscore.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleTest implements Test{
	
	private final List<Question> questions;
	private final String name;
	private final String description;
	private Integer currentQuestion;
	
	SimpleTest(Collection<Question> questions, String name, String description){
		this.questions = new ArrayList<Question>(questions);
		this.name = name;
		this.description = description;
		setCurrentQuestion(0);
	}

	public Integer getCurrentQuestion() {
		return currentQuestion;
	}


	public void setCurrentQuestion(Integer currentQuestion) {
		this.currentQuestion = currentQuestion;
	}
	
	@Override
	public List<Question> getQuestions() {
		return questions;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	
}

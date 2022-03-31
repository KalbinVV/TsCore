package org.kalbinvv.tscore.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleTest implements Test, Serializable{
	
	private static final long serialVersionUID = -3711852710197704976L;
	private final List<Question> questions;
	private final boolean shouldBeShuffled;
	private final String name;
	private final String description;
	private Integer currentQuestion = 0;
	
	public SimpleTest(String name, String description, Collection<Question> questions,
			boolean shouldBeShuffled){
		this.questions = new ArrayList<Question>(questions);
		this.name = name;
		this.description = description;
		this.shouldBeShuffled = shouldBeShuffled;
	}

	
	public SimpleTest(Test test) {
		this.questions = test.getQuestions();
		this.name = test.getName();
		this.description = test.getDescription();
		this.shouldBeShuffled = test.isShuffled();
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
	
	@Override
	public int getCurrentQuestion() {
		return currentQuestion;
	}
	
	@Override
	public void setCurrentQuestion(int currentQuestion) {
		this.currentQuestion = currentQuestion;	
	}
	
	@Override
	public boolean isShuffled() {
		return shouldBeShuffled;
	}
	
	@Override
	public String toString() {
		return "SimpleTest{"
				+ "questions='" + questions + ", "
				+ "name='" + name + "', "
				+ "description='" + description + "', "
				+ "currentQuestion='" + currentQuestion + "',"
				+ "shouldBeShuffled='" + shouldBeShuffled + "'"
				+ "}";
	}
	
}

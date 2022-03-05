package org.kalbinvv.tscore.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleTest implements Test, Serializable{
	
	private static final long serialVersionUID = -3711852710197704976L;
	private final List<Question> questions;
	private final String name;
	private final String description;
	private final Integer id;
	private Integer currentQuestion;
	
	public SimpleTest(String name, String description, Collection<Question> questions, Integer id){
		this.questions = new ArrayList<Question>(questions);
		this.name = name;
		this.description = description;
		this.id = id;
		setCurrentQuestion(0);
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
	public int getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return "SimpleTest{"
				+ "questions='" + questions + ", "
				+ "name='" + name + "', "
				+ "description='" + description + "', "
				+ "id='" + id + "', "
				+ "currentQuestion='" + currentQuestion + "'"
				+ "}";
	}
	
}

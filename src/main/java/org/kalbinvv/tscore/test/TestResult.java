package org.kalbinvv.tscore.test;

import java.io.Serializable;
import java.util.Map;

import org.kalbinvv.tscore.user.User;

public class TestResult implements Serializable{

	private static final long serialVersionUID = 6701911657488391681L;
	private final int amountOfCorrectAnswers;
	private final int amountOfAnswers;
	private final User user;
	private final Test test;
	private final Map<String, Integer> answersResult;
	
	public TestResult(int amountOfAnswers, int amountOfCorrectAnswers, 
			User user, Test test, Map<String, Integer> answersResult) {
		this.amountOfAnswers = amountOfAnswers;
		this.amountOfCorrectAnswers = amountOfCorrectAnswers;
		this.user = user;
		this.test = test;
		this.answersResult = answersResult;
	}
	
	public int getAmountOfCorrectAnswers() {
		return amountOfCorrectAnswers;
	}

	public int getAmountOfAnswers() {
		return amountOfAnswers;
	}
	
	public Test getTest() {
		return test;
	}
	
	public User getUser() {
		return user;
	}
	
	public Map<String, Integer> getAnswersResult() {
		return answersResult;
	}
	
	@Override
	public String toString() {
		return "TestResult{"
				+ "amountOfCorrectAnswers='" + amountOfCorrectAnswers + "', "
				+ "amountOfAnswers='" + amountOfAnswers + "', "
				+ "user='" + user + "', "
				+ "test='" + test + "',"
				+ "answersResult='" + answersResult + "'"
				+ "}";
	}
	
}

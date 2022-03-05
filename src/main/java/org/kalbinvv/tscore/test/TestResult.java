package org.kalbinvv.tscore.test;

import java.io.Serializable;

import org.kalbinvv.tscore.user.User;

public class TestResult implements Serializable{

	private static final long serialVersionUID = 6701911657488391681L;
	private final int amountOfCorrectAnswers;
	private final int amountOfAnswers;
	private final User user;
	private final Test test;
	
	public TestResult(int amountOfAnswers, int amountOfCorrectAnswers, User user, Test test) {
		this.amountOfAnswers = amountOfAnswers;
		this.amountOfCorrectAnswers = amountOfCorrectAnswers;
		this.user = user;
		this.test = test;
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
	
	@Override
	public String toString() {
		return "TestResult{"
				+ "amountOfCorrectAnswers='" + amountOfCorrectAnswers + "', "
				+ "amountOfAnswers='" + amountOfAnswers + "', "
				+ "user='" + user + "', "
				+ "test='" + test + "'"
				+ "}";
	}
	
}

package org.kalbinvv.tscore.test;

import java.io.Serializable;
import java.util.Map;

public class TestData implements Serializable{

	private static final long serialVersionUID = 5002015523483309468L;
	private final Test test;
	private final Map<String, Answer> answers;

	public TestData(Test test, Map<String, Answer> answers) {
		this.test = test;
		this.answers = answers;
	}

	public Test getTest() {
		return test;
	}

	public Map<String, Answer> getAnswers() {
		return answers;
	}

	@Override
	public String toString() {
		return "TestData{"
				+ "test='" + test + "', "
				+ "answers='" + answers + "'"
				+ "}";
	}

}

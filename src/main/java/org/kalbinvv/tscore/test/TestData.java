package org.kalbinvv.tscore.test;

import java.io.Serializable;
import java.util.List;

public class TestData implements Serializable{

	private static final long serialVersionUID = 5002015523483309468L;
	private final Test test;
	private final List<List<String>> answers;

	public TestData(Test test, List<List<String>> answers) {
		this.test = test;
		this.answers = answers;
	}

	public Test getTest() {
		return test;
	}

	public List<List<String>> getAnswers() {
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

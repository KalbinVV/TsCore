package org.kalbinvv.tscore.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleQuestion implements Question, Serializable{

	private static final long serialVersionUID = -4282292014785596027L;
	private final String title;
	private final QuestionType questionType;
	private final List<String> variants;
	private List<String> userSelect; 
	
	public SimpleQuestion(String title, QuestionType questionType, Collection<String> variants){
		this.title = title;
		this.questionType = questionType;
		this.variants = new ArrayList<String>(variants);
		userSelect = new ArrayList<String>();
	}
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public QuestionType getType() {
		return questionType;
	}

	@Override
	public List<String> getVariants() {
		return variants;
	}

	@Override
	public void setUserSelect(List<String> userSelect) {
		this.userSelect = userSelect;
	}

	@Override
	public List<String> getUserSelect() {
		return userSelect;
	}
	
	@Override
	public String toString() {
		return "SimpleQuestion{"
				+ "title='" + title + "', "
				+ "questionType='" + questionType + "', "
				+ "variants='" + variants + "', "
				+ "userSelect='" + userSelect + "'"
				+ "}";
	}

}

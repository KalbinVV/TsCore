package org.kalbinvv.tscore.user;

import java.io.Serializable;

public class UserEntry implements Serializable{

	private static final long serialVersionUID = -2946316636980408516L;
	
	public String name;
	public String pass;
	
	public UserEntry(String name, String pass){
		this.name = name;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "UserEntry{"
				+ "name='" + name + "', "
				+ "pass='" + pass + "'"
				+ "}";
	}
	
	
}

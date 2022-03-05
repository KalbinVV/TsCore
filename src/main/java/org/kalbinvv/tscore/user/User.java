package org.kalbinvv.tscore.user;

import java.io.Serializable;
import java.net.InetAddress;

import org.kalbinvv.tscore.test.Test;

public class User implements Serializable{

	private static final long serialVersionUID = -1279985367451585234L;
	private final String name;
	private final String pass;
	private UserStatus userStatus;
	private UserType userType;
	private InetAddress address;
	private Test test;
	
	public User(String name, String pass){
		this.name = name;
		this.pass = pass;
		userStatus = UserStatus.NotConnected;
		userType = UserType.User;
	}
	
	
	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}
	
	
	public UserStatus getUserStatus() {
		return userStatus;
	}
	
	
	public void setType(UserType userType) {
		this.userType = userType;
		
	}

	
	public UserType getType() {
		return userType;
	}

	
	public void setName(String name) {
		throw new UnsupportedOperationException();
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setAddress(InetAddress address) {
		this.address = address;
	}

	
	public InetAddress getAddress() {
		return address;
	}

	
	public Test getTest() {
		return test;
	}

	
	public void setTest(Test test) {
		this.test = test;
	}
	
	
	public void setPass(String pass) {
		throw new UnsupportedOperationException();
	}

	
	public String getPass() {
		return pass;
	}
	
	
	public UserEntry toEntry() {
		return new UserEntry(name, pass);
	}
	
	public String getStringRepresentation() {
		return name + " " + address;
	}
	
	public String toString() {
		return "User{"
				+ "userStatus='"+userStatus+"', "
				+ "name='"+name+"', "
				+ "pass='"+pass+"', "
				+ "address='"+address+"', "
				+ "test='"+test+""
				+ "'}";
	}
	
}

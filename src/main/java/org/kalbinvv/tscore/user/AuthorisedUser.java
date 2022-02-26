package org.kalbinvv.tscore.user;

import java.io.Serializable;
import java.net.InetAddress;

import org.kalbinvv.tscore.test.Test;

public class AuthorisedUser implements User, Serializable{

	private static final long serialVersionUID = -1279985367451585234L;
	private final String name;
	private final String pass;
	private UserStatus userStatus;
	private UserType userType;
	private InetAddress address;
	private Test test;
	
	public AuthorisedUser(String name, String pass){
		this.name = name;
		this.pass = pass;
		userStatus = UserStatus.NotConnected;
		userType = UserType.User;
	}
	
	@Override
	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}
	
	@Override
	public UserStatus getUserStatus() {
		return userStatus;
	}
	
	@Override
	public void setUserType(UserType userType) {
		this.userType = userType;
		
	}

	@Override
	public UserType getUserType() {
		return userType;
	}

	@Override
	public void setName(String name) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setAddress(InetAddress address) {
		this.address = address;
	}

	@Override
	public InetAddress getAddress() {
		return address;
	}

	@Override
	public Test getTest() {
		return test;
	}

	@Override
	public void setTest(Test test) {
		this.test = test;
	}
	
	@Override
	public void setPass(String pass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getPass() {
		return pass;
	}
	
	@Override
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

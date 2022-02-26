package org.kalbinvv.tscore.user;

import java.io.Serializable;
import java.net.InetAddress;

import org.kalbinvv.tscore.test.Test;

public class AnonymousUser implements User, Serializable{

	private static final long serialVersionUID = -2220058324601010364L;
	private UserStatus userStatus;
	private String name;
	private InetAddress address;
	private Test test;
	
	public AnonymousUser(){
		userStatus = UserStatus.NotConnected;
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
	public void setName(String name) {
		this.name = name;
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
	public String toString() {
		return "AnonymousUser{"
				+ "userStatus='"+userStatus+"', "
				+ "name='"+name+", "
				+ "address='"+address+"', "
				+ "test='"+test+""
				+ "'}";
	}
	
}

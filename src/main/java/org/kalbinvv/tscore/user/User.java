package org.kalbinvv.tscore.user;

import java.net.InetAddress;

import org.kalbinvv.tscore.test.Test;

public interface User {
	
	public void setUserStatus(UserStatus userStatus);
	public UserStatus getUserStatus();
	public void setName(String name);
	public String getName();
	public void setAddress(InetAddress inetAddress);
	public InetAddress getAddress();
	public void setTest(Test test);
	public Test getTest();
	
}

package org.kalbinvv.tscore.user;

import java.util.List;

public interface UsersStorage {

	public List<User> getUsers();
	public void addUser(User user);
	public void removeUser(User user);
	
}

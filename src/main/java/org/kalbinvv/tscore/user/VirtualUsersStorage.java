package org.kalbinvv.tscore.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VirtualUsersStorage implements UsersStorage{

	List<User> users;
	
	public VirtualUsersStorage(Collection<User> users){
		this.users = new ArrayList<User>(users);
	}
	
	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void removeUser(User user) {
		users.remove(user);
	}

}

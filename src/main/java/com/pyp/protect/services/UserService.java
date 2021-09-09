package com.pyp.protect.services;

import java.util.List;

import com.pyp.protect.entities.Users;

public interface UserService {
	
	public List<Users> getUsers();
	
	public Users getUser(long userId);
	
	public Users addUser(Users user);
	
	public Users updateUser(Users user);
	
	public void deleteUser(String id);

}

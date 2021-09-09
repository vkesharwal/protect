package com.pyp.protect.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.pyp.protect.entities.Users;

@Service
public class UserServiceImpl implements UserService {

	
	List<Users> list ;
	public UserServiceImpl() {
		list = new ArrayList<>();
		list.add(new Users(111, "Vishal Kesharwal", "vkesharwal@gmail.com", "7760230490"));
		list.add(new Users(121, "Mayank Kesharwal", "mayank19@gmail.com", "9535324762"));
		
	}
	
	@Override
	public List<Users> getUsers() {
		return list;
	}

	@Override
	public Users getUser(long userId) {
		Users c = null;
		for(Users users:list) {
			if(users.getId()==userId) {
				c=users;
				break;
			}
		}
		return c;
	}

	@Override
	public Users addUser(Users user) {

		list.add(user);
		return user;
	}

	@Override
	public Users updateUser(Users user) {
		list.forEach(e ->{
			System.out.println(user.toString());
			if(e.getId()==user.getId()) {
				e.setName(user.getName());
				e.setEmailID(user.getEmailID());
				e.setMobileNum(user.getMobileNum());
				
			}
		});
		return this.getUser(user.getId());
	}

	@Override
	public void deleteUser(String id) {
		list.removeIf(e -> e.getId()==Long.parseLong(id) );
		return;
	}
	
	

}

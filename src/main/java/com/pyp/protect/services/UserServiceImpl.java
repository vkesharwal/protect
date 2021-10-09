package com.pyp.protect.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyp.protect.dao.UsersDao;
import com.pyp.protect.entities.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersDao userDao;
	
	//List<Users> list ;
	public UserServiceImpl() {
		/*
		 * list = new ArrayList<>(); list.add(new Users(111, "Vishal Kesharwal",
		 * "vkesharwal@gmail.com", "7760230490")); list.add(new Users(121,
		 * "Mayank Kesharwal", "mayank19@gmail.com", "9535324762"));
		 */
	}
	
	@Override
	public List<Users> getUsers() {
		//return list;
		return userDao.findAll();
	}

	@Override
	public Users getUser(long userId) {
		/*
		 * Users c = null; for(Users users:list) { if(users.getId()==userId) { c=users;
		 * break; } } return c;
		 */
		return userDao.findById(userId).get();
	}

	@Override
	public Users addUser(Users user) {

//		list.add(user);
		userDao.save(user);
		return user;
	}

	@Override
	public Users updateUser(Users user) {
//		list.forEach(e ->{
//			System.out.println(user.toString());
//			if(e.getId()==user.getId()) {
//				e.setName(user.getName());
//				e.setEmailID(user.getEmailID());
//				e.setMobileNum(user.getMobileNum());
//				
//			}
//		});
		user.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		userDao.save(user);
		return this.getUser(user.getId());
	}

	@Override
	public void deleteUser(String id) {
		//list.removeIf(e -> e.getId()==Long.parseLong(id) );
		//return;
		Users entity = userDao.findById(Long.parseLong(id)).get();
		userDao.delete(entity);
	}
	
	

}

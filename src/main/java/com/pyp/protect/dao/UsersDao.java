package com.pyp.protect.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyp.protect.entities.Users;
import com.pyp.protect.pk.UsersPK;

public interface UsersDao extends JpaRepository<Users, UsersPK> {

	
	
}

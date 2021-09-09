package com.pyp.protect.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyp.protect.entities.Users;

public interface UsersDao extends JpaRepository<Users, Long> {

}

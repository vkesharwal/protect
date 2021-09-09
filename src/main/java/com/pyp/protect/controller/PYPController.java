package com.pyp.protect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pyp.protect.entities.Users;
import com.pyp.protect.services.UserService;

@RestController
public class PYPController {
	
	@Autowired
	private UserService userService;

	//Get the user details
	@GetMapping("/users")
	public List<Users> getUsers(){
		return this.userService.getUsers();
		
	}
	
	@GetMapping("/users/{userId}")
	public Users getUser(@PathVariable String userId) {
		return this.userService.getUser(Long.parseLong(userId));
	}
	
	@PostMapping("/users")
	public Users addUser(@RequestBody Users user) {
		return this.userService.addUser(user);
	}
	
	@PutMapping("/users")
	public Users updateUser(@RequestBody Users user) {
		return this.userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String userId){
		try {
			this.userService.deleteUser(userId);
		return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
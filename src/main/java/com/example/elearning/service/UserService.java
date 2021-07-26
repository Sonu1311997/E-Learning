package com.example.elearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elearning.domain.User;
import com.example.elearning.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> saveUsers(List<User> users) {
		return userRepository.saveAll(users);
	}
	
	 public List<User> getUsers() {
	        return userRepository.findAll();
	    }

	
	public User getUserById(long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}
	
	public String deleteUser(long id) {
		userRepository.deleteById(id);
		return "User Deleted Successfully !!" +id;
	}
	
	 public User updateUser(User user) {
	        User existingUser = userRepository.findById(user.getId()).orElse(null);
	        existingUser.setName(user.getName());
	        existingUser.setPhone_no(user.getPhone_no());
	        existingUser.setEmail(user.getEmail());
	        existingUser.setAddress(user.getAddress());
	        existingUser.setReg_date(user.getReg_date());
	        existingUser.setPassword(user.getPassword());
	        existingUser.setUpload_photo(user.getUpload_photo());
	        return userRepository.save(existingUser);
	    }

}

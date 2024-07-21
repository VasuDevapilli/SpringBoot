package com.excelr.service;

import java.util.List;

import com.excelr.model.User;

public interface UserService {
	
	public User saveUser(User user);
	public User updateUser(User user);
	public User getOneUser(int id);
	public void deleteUser(int  id);
	public List<User> getAllUsers();

}

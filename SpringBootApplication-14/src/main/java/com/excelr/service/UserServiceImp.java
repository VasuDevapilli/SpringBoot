
package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.User;
import com.excelr.repo.UserRepo;

@Service
public class UserServiceImp implements UserService {

	@Autowired private UserRepo repo;
	
	@Override
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	@Override
	public List<User> getAllUsers() {
		List<User> listOfUsers=(List<User>) repo.findAll();
		return listOfUsers;
	}
	
	@Override
	public void deleteUser(int id) {
		repo.deleteById(id);

	}
	@Override
	public User getOneUser(int id) {
		User getOneRecord=repo.findById(id).get();
		return getOneRecord;
	}

	@Override
	public User updateUser(User user) {
	User update=repo.save(user);
		return update;
	}

	
	
}
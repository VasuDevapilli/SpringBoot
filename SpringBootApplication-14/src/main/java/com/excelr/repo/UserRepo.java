package com.excelr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

	
}

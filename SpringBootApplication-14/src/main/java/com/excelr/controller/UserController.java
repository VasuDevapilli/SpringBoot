package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.model.User;
import com.excelr.service.UserServiceImp;

@Controller
public class UserController {

	@Autowired
	UserServiceImp service;

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/userForm")
	public String displayUserForm() {
		return "user_reg";
	}

	@RequestMapping("/submit")
	public String saveUserFormData(User user, ModelMap model) {
		User saveData = service.saveUser(user);
		return "success";

	}

	@RequestMapping("/viewAllUsers")
	public String getAll(ModelMap model) {
		model.put("users", service.getAllUsers());
		return "viewusers";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		service.deleteUser(id);
		return "redirect:/viewAllUsers";
	}

	@RequestMapping("/editUser/{id}")
	public String editUserForm(@PathVariable int id, ModelMap model) {
		model.put("command", service.getOneUser(id));
		return "editForm";
	}

	@RequestMapping("/updateandsave")
	public String updateAndSaveUserDeatils(User user, ModelMap model) {
		User saveData = service.updateUser(user);
		return "redirect:/viewAllUsers";
	}

}

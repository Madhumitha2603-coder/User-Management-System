package com.example.ums.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ums.entity.User;
import com.example.ums.service.UserService;
@Controller
public class UserUiController {
	public final UserService userService;

	public UserUiController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/adding-user")
	public String addUser(User user) {
		userService.addUser(user);
		return "index.jsp";
	}
	@GetMapping("/displaying-user")
	public String findAllUser(Model model) {
		List<User> user=userService.getUser();
		model.addAttribute("user",user);
		return "displayuser.jsp";
	}


}

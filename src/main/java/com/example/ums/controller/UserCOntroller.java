package com.example.ums.controller;



	import java.util.List;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.ums.entity.User;
	import com.example.ums.service.UserService;

	@RestController
	
	public class UserController {
		private final UserService userService;

		public UserController(UserService userService) {
		
			this.userService = userService;
			
			}
		

		   @PostMapping("/add-user")
				public User addUser(@RequestBody User user) {
			    return userService.addUser(user);
					
		   }
		   
		 @GetMapping("/get-user")
		 public List<User> findAllUser(){
			 return userService.getUser();
		 }
		

}

package com.example.ums.service;


	import java.util.List;

	import org.springframework.stereotype.Service;

	import com.example.ums.entity.User;
	import com.example.ums.repository.UserRepository;
	@Service
	public class UserService {
		
		private final UserRepository userRepository;

		public UserService(UserRepository userRepository) {
			this.userRepository = userRepository;
		}


		 public User addUser (User user) {
		        return userRepository.save(user);
		    }

		   public List<User> getAllUsers() {
		        return userRepository.findAll();
		    }


		public List<User> getUser() {
			return userRepository.findAll();
		}
		

}

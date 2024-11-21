package com.example.ums.security;




import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.ums.repository.UserRepository;
@Service
public class UserServiceDetailsImple implements UserDetailsService{
	

	
		private final UserRepository userRepository;

		

		public UserServiceDetailsImple(UserRepository userRepository) {
			super();
			this.userRepository = userRepository;
		}



		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			return  userRepository.findByEmail(username).map(UserDetailsImple::new).orElseThrow(()->new UsernameNotFoundException("failed to authenticat user"));
			
		}


}

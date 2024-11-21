package com.example.ums.entity;


	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
@Entity	

public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)	
		private int userid;
		  @Column(unique = true, nullable = false)
		    private String username;

		    @Column(nullable = false)
		    private String firstName;

		    @Column(nullable = false)
		    private String lastName;

		    @Column(unique = true, nullable = false)
		    private String email;

		    @Column(nullable = false)
		    private String password;

		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getUserName() {
			return username;
		}
		public void setUserName(String userName) {
			this.username = userName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		

}

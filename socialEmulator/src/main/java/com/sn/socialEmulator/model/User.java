package com.sn.socialEmulator.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
	public class User {
	    @Id
	    private String email;
		private int password;
	  

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPassword(int password) {
			this.password = password;
		}

	

		 public User() {
		     
		    }


	    public User(String email, int password) {
	        this.email = email;
	        this.password = password;
	       
	    }

	    public String getEmail() {
	        return email;
	    }

	    public int getPassword() {
	        return password;
	    }

	   

	 
	

}

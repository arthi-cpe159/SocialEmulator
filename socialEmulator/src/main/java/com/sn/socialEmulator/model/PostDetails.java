package com.sn.socialEmulator.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class PostDetails {
	@Id
	private String email;
	private String url;
	
	
	public PostDetails() {
		
	}
	    public PostDetails(String email, String url) {
		this.email = email;
		this.url = url;
	}
		public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
		
	  

	



}

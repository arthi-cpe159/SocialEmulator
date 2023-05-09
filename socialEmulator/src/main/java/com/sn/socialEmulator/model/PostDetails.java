package com.sn.socialEmulator.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class PostDetails {
	@Id
	private String digitalSignature;
	private String email;
	private String caption;
	private String name;
	
	public PostDetails() {
		
	}
	
	public PostDetails(String digitalSignature, String email, String caption, String name) {
		
		this.digitalSignature = digitalSignature;
		this.email = email;
		this.caption = caption;
		this.name = name;
	}
		
	public String getDigitalSignature() {
		return digitalSignature;
	}
	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	



}

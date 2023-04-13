package com.sn.socialEmulator.payload;

public class PostData {
	private String email;
	private String digitalSignature;
	
	public PostData() {
		
	}
	
	public PostData(String email, String digitalSignature) {
		this.email = email;
		this.digitalSignature = digitalSignature;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDigitalSignature() {
		return digitalSignature;
	}
	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}
	
}

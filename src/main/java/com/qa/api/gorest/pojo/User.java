package com.qa.api.gorest.pojo;

public class User {
	
	
	//class variables
	private String name;
	private String email;
	private String gender;
	private String status;
	private String created_at;
	private String updated_at;
	
	
	
	
	//constructor
	public User(String name, String email, String gender, String status, String created_at, String updated_at) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}



//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}


  public void setEmail(String email) {
		this.email = email;
	}



 public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

}

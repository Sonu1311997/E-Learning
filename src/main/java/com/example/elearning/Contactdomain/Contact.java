package com.example.elearning.Contactdomain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")

public class Contact {
	
	@Id
	private Long user_id;
	private String name;
	private String Email;
	private String Phone_no;
	private String Message;
	private long contact_id;
	
	public Long getUser_id() {
		return user_id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return Email;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public String getMessage() {
		return Message;
	}
	public long getContact_id() {
		return contact_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public void setContact_id(long contact_id) {
		this.contact_id = contact_id;
	}

}

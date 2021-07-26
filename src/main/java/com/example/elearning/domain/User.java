package com.example.elearning.domain;
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
@Table(name = "User")

public class User {
	
	@Id
	private Long id;
	private String name;
	private String phone_no;
	private String email;
	private String address;
	private String reg_date;
	private String password;
	private String upload_photo;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getReg_date() {
		return reg_date;
	}
	public String getPassword() {
		return password;
	}
	public String getUpload_photo() {
		return upload_photo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUpload_photo(String upload_photo) {
		this.upload_photo = upload_photo;
	}

	}
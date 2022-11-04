package com.six.assigment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name ="Customer_Springboot")
public class Customer {
	
	@Id
	private String userName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String name;
	@Column(unique = true,nullable = false)
	private String email;	
	@Column(unique = true,nullable = false)
	private String mobileNo;
	@Column(nullable = false)
	private String country;
	
	public Customer() {
		super();

	}
	public Customer(String userName, String password, String name, String email, String mobileNo, String country) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.country = country;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", country=" + country + "]";
	}
	
	

}

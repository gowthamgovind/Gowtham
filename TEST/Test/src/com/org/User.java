package com.org;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class User {
	@Id
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="PASSWORD")
	private String passWord;
	@Column(name="FULL_NAME")
	private String fullName;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="PHONE_NUMBER")
	private long phoneNumber;
	

	@OneToMany(mappedBy = "user")
	private Set<Vehicle> vehicle = new HashSet<Vehicle>();

	
	public Set<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}

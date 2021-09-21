package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;



@Entity
@Table(name="users")
public class User {
	
@Id
@GeneratedValue()
@Column
private long userId;

@NotNull
@Column
private String userName;

@NotNull
@Column
private String email;

@NotNull
@Column
private String password;

@NotNull
@Column
private int age ;

@NotNull
@Column
private String contactNo;

@OneToMany
@JoinColumn( name = "address_id", nullable = false)
private Address address ;

private List <User> user;

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(long userId, String userName, String email, String password, int age, String contactNo) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.email = email;
	this.password = password;
	this.age = age;
	this.contactNo = contactNo;
}

public long getUserId() {
	return userId;
}

public void setUserId(long userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getContactNo() {
	return contactNo;
}

public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
			+ ", age=" + age + ", contactNo=" + contactNo + "]";
}


	


}

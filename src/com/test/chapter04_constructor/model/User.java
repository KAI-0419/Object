package com.test.chapter04_constructor.model;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date regDate;
	
	public User() {}
		
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date regDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);
		
		this.regDate = regDate;
	}
	
	public void information() {
		System.out.println(userId + "," + userPwd + "," + userName + "," + regDate);
	}
	
	
}

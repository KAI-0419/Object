package com.test.chapter04_constructor.run;

import java.util.Date;

import com.test.chapter04_constructor.model.User;

public class MTest {
	public static void main(String[] args) {
		User u1 = new User();
		u1.information();
		
		User u2 = new User("user01","pwd01","강현");
		u2.information();
		
		User u3 = new User("user02","pwd02","Kai",new Date());
		u3.information();
	}
}
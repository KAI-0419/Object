package com.test.chap03_field.test01;

public class KindsOfVariable {
	//필드 == 멤버변수 == 전역변수
	private int globalNum;
	
	public void testMethod(int num) {
		
		int localNum;
		
		System.out.println(num);
//		System.out.println(localNum);
		
		System.out.println(globalNum);
	}
	
	public void testMethod2() {
		System.out.println(globalNum);
//		System.out.println(localNum);
	}
}

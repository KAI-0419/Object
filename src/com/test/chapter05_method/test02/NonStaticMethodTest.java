package com.test.chapter05_method.test02;

public class NonStaticMethodTest {
	public void method() {
		
		System.out.println("매개변수와 변환값이 둘 다 없는 메소드 입니다.");
		
		return;
	}
	
	public String method2() {
		return "매개변수가 없지만 변환값이 있는 메소드 입니다.";
	}
	
	public void method3(int n1, int n2) {
		System.out.println("sum: "+(n1+n2));
	}
	
	public int method4(int n1, int n2) {
		return n1+n2;
	}
}

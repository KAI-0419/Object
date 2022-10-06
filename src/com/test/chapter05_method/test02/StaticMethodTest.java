package com.test.chapter05_method.test02;

public class StaticMethodTest {
	public static void staticMethod1() {
		int n1 = 10;
		int n2 = 20;
		System.out.println("10과 20의 합은: "+(n1+n2)+"입니다.");
	}
	public static int staticMethod2() {
		int n1 = 10;
		int n2 = 30;
		int sum = n1+n2;
		
		return sum;
	}
	
	public static void staticMethod3(String name) {
		System.out.println(name + "님의 방문을 환영합니다!");
	}
	
	public static String staticMethod4(String name) {
		return name + "님의 방문을 환영합니다!";
	}
	
}

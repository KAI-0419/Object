package com.test.chapter05_method.test02;

public class MTest {
	public static void main(String[] args) {
		NonStaticMethodTest test = new NonStaticMethodTest();
		
		test.method();
		
//		test.method2(); == "매개변수가 없지만 변환값이 있는 메소드 입니다."
		String str = test.method2();
		System.out.println(str);
		
		test.method3(10,'A');
		
		int res = test.method4(10, 20);
		System.out.println(res);
		
		System.out.println(test.method4(10, 'B'));
		
		StaticMethodTest.staticMethod1();
		System.out.println(StaticMethodTest.staticMethod2());
		StaticMethodTest.staticMethod3("강현");
		System.out.println(StaticMethodTest.staticMethod4("강현"));
	}

}

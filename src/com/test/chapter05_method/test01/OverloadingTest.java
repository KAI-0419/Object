package com.test.chapter05_method.test01;

public class OverloadingTest {
	public int test() {
		return 0;
	}
	public int test(int a) {
		return 0;
	}
	public int test(int a, int b) {
		return 0;
	}
	public int test(int a, String s) {
		return 0;
	}
	
	//매개변수 명은 오버로딩과 관련 없다. 매개변수의 갯수와 타입(타입의 순서까지)고려
//	public int test(int b, int a) {
//		return 0;
//	}
	
	public int test(String s, int a) {
		return 0;
	}
	
	public String test(int a, int b, String str) {
		return null;
	}
	
	//리턴타입이 다르다고 오버로딩이 적용되지 않는다.
//	public int test(int a, int b, String str){
//	return 0;
//	}
	
	//접근제한자가 다르다고 오버로딩 적용 되지 않는다.
//	private int test(int a, int b, String str) {
//		return 0;
//	}
	
}

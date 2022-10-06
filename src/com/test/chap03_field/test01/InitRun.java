package com.test.chap03_field.test01;

public class InitRun {
	public static void main(String[] args) {
		InitBlock p = new InitBlock();
		p.information();
		
		InitBlock p2 = new InitBlock("아이폰",2000000,"애플");
		p2.information();
		
		p2.setName("아이폰14");
		p2.information();
		p2.setName("Iphone14");
		p2.information();
		
		System.out.println(p2.getName());
	}
}

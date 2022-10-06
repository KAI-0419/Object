package com.test.chapter01_encapsulation;

public class Account {
	private String name = "이강현";
	private String account = "356-0873-7818-13";
	private String pwd = "1909";
	private int balance = 0;
	
	//생성자(객체를 생성하기 위한 메소드)
	public Account() {
		
	}
	
	//입금을 위한 메소드
	public void in(int money) {
		if(money>0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " +money+"원이 입금 되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력 되었습니다.");
		}
	}
	
	//출금을 위한 메소드
	public void out(int money) {
		if(money < balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 "+money+"원이 출금 되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	//잔액조회를 위한 메소드
	public void display() {
		System.out.println(name + "님의 잔액은 "+balance+"원 입니다.");
	}
	
}

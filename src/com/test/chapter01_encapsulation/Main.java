package com.test.chapter01_encapsulation;

public class Main {
	public  static void main(String[] args) {
		Account a = new Account();
		
		//잔액조회
		a.display();
		
		//100만원 입금
		a.in(1000000);
		a.display();
		
		//200만원 입금
		a.in(2000000);
		a.display();
		
		//400만원 입금
		a.in(4000000);
		a.display();
		
		//누가 account 객체의 기능을 무시하고 잔액을 훔쳐갔다.
		a.out(6000000);
		a.display();
		
		a.out(1000000);
		a.display();
		
		System.out.println("---------------------------");
		
		//Score 클래스 객체 생성
		
		Score sc = new Score();
		
		sc.sum();
		sc.avg();
		sc.information();
	}
}

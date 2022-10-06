package com.test.chapter01_encapsulation;

public class Score {
	//이름, 국어, 영어, 수학
	private String name = "Kai";
	private int kor = 90;
	private int eng = 95;
	private int math = 85;
	
	//생성자
	public Score() {
		
	}
	
	//총합
	public void sum() {
		System.out.println(name+" 학생의 점수 총합: "+(kor+eng+math));
	}
	
	//평균
	public void avg() {
		int avg = (kor+eng+math)/3;
		System.out.println(name+" 학생의 점수 평균: " +avg);
	}
	//필드값을 확인할 수 있는 메소드
		public void information() {
			System.out.println("name= "+name+", kor="+kor+", eng"+", math="+math);
	}
	
	
	
	
}

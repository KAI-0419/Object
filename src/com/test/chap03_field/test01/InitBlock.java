package com.test.chap03_field.test01;

public class InitBlock {

	private String name = "갤럭시";
	private int price = 1000000;
	private static String brand = "삼성";
	
	{
		name = "갤럭시플립";
		price = 1200000;
		brand = "Samsung";
	}
	static {
		brand = "SAMSUNG";
	}
	
	public InitBlock() {}
	
	public InitBlock(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		InitBlock.brand = brand;
	}
	public void setName(String pName) {
		name = pName;
	}
	public String getName() {
		return name;
	}
		
		public void information() {
		System.out.println(name+" "+price+","+brand);
		}
}

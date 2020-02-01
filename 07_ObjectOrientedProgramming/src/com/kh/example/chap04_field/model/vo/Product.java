package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500;
	private static int num = 100;

	static {
//		name = "홈런볼";
//		brand = "해태";
//		price = 2000;
//		생성시기가 달라서 사용불가 
//			==> static이 먼저 메모리 영역에 생성되고 인스턴스 변수는 
//				객체 생성시에 메모리에 올라가기 때문에
		num = 150;
		num--;
//		프로그램 시작 시 한 번만 초기화
	}

	{
		name = "칸초";
		price = 1000;
		brand = "롯데";
		num -= 10;
//		객체 생성시 마다 초기화
	}

	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}
}

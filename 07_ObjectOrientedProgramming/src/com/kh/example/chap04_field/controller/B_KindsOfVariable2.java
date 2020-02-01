package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	public static int staticNum;

	private int testNum = 10; // 객체를 생성해서 메모리 영역에 올라가는 변수를 인스턴스 블럭
	private static int staticTestNum = 10; // 객체 생성 없이 static 메모리에 바로 올라갈수 있는 클래스 변수

	public B_KindsOfVariable2() { // 생성자
		testNum++;
		System.out.println("test : " + testNum);

		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
}

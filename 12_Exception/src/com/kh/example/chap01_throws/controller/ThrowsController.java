package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("메소드1 호출 됨...");
		method2();
		System.out.println("메소드1 종료 됨...");
	}

	public void method2() throws Exception {
		System.out.println("메소드2 호출 됨...");
		method3();
		System.out.println("메소드2 종료 됨...");
	}

	public void method3() throws Exception {
		System.out.println("메소드3 호출 됨...");
		throw new Exception(); // 강제적으로 Exception발생
//		System.out.println("메소드3 종료 됨...");
		// 에러가 발생하면 비정상 종료 되기 때문에 에러 발생 아래의 내용들은 실행되지 않음
		// 따라서 도달할 수 없는 코드, 의미 없는 코드라고 빨간 줄 뜨는 것
	}
}

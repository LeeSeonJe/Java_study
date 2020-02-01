package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTset {
	// 매개변수의 유무와 반환 값 유무에 따른 구분
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
//		      반환 값x     매개변수x
		System.out.println("매개변수와 반환 값 둘다 없는 메소드입니다.");
		// 안에 기능만 수행하고 리턴값 반환하지 않음
	}

	// 2. 매개변수 없고 반환 값 있는 메소드
	public int method2() {
//		   반환 값o      매개변수x
//		This method must return a result of type int
//		이 메소드는 반드시 int타입 결과의 리턴값을 가져야한다.
//		return 0;
		int i = 10;
		return i;
	}

	// 3. 매개변수 있고 반환 값 없는 메소드
	public void method3(int num1, int num2) {
//		     반환 값x          매개변수 값o
		System.out.println(num1);
		System.out.println(num2);
		int sum = num1 + num2;
		System.out.println(sum);
	}

	// 4. 매개변수 있고 반환 값 있는 메소드
	public int method4(int num1, int num2) {
//		     반환 값o		    	매개변수 값o 
		return num1 + num2;
	}

	// 심화 1. 반환 값이 배열인 경우
	// 심화 2. 반환 값이 클래스인 경우
	public int[] method5() {
		int[] iArr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);
		return iArr;
	}

	public User method6() {
		User user = new User("user01", "pass01", "이선제");
		System.out.println("MethodTest user : " + user);
		return user;
	}
}

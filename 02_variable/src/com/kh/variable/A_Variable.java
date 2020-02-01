package com.kh.variable;

public class A_Variable {// 클래스

	public void declareVeariable() { // 메소드
		// 변수 선언 후 초기화
		// A. 변수 선언 : 자료형 변수명;

		// 1. 논리형 boolean
		boolean isTrue;

		// 2. 문자형
		// 2_1. 문자
		char ch;
		// 2_2. 문자열
		String str;

		// 3. 숫자
		// 3_1. 정수
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 3_2. 실수
		float fNum;
		double dNum;

		// B. 초기화 : 변수명 = 값;

		isTrue = true;
		ch = 'A'; // 1 문자
		str = "A"; // 1~n 문자
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
//		fNum = 4.0; 
//		Type mismatch: cannot convert from double to float
//		: 4.0은 실수인데 기본적으로 실수는 double이 기본형이기 때문에 4.0을 float가 아닌 double형으로 보고있음
//		  but fNum은 float형이고 기본형이 double형이기 때문에 4byte 크기 안에 8byte를 넣을 수 없기 때문에 에러발생
		fNum = 4.0f;
		dNum = 8.0;
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
	}

	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 1. 논리형
		boolean isTrue = false;
		// 2. 문자형
		// 2_1. 문자
		char ch = 'B';
		// 2_2. 문자열
		String str = "Hello";
		// 3. 숫자형
		// 3_1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		// 3_2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0d;

		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
	}
}

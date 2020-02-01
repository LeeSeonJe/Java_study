package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age; // 일반 변수
		final int AGE; // 상수 선언

		age = 20;
		AGE = 20;

		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);

		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// final 변수인 AGE는 상수이므로 하나의 데이터 값만 저장할 수 있는데 
		// AGE 값에 이미 저장된 데이터를 변경하려고 하기 때문에 나타나는 에러
		
		System.out.println();
		System.out.println("값 변경 후 age : " + age);
		System.out.println("값 변경 후 AGE : " + AGE);
	}
}

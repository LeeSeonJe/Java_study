package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100;
		// 논리형 boolean은 true, false를 제외하고 다른 값은 넣어줄 수 없다.(형변환이 되지않음)

		int num = 'A';
		System.out.println("num : " + num);

		char ch = 97;
		System.out.println("ch : " + ch);

		char ch2 = (char) num;
		System.out.println("ch2 : " + ch2);
		// Type mismatch: cannot convert from int to char
		// 리터럴값 자체는 컴퓨터가 자동으로 계산해서 넣어주고 변수로 된 값은 자료형의 크기만을 보기 때문에 형변환이 이루어 져야한다.
		int num2 = -97;
		char ch3 = (char) num2;
		System.out.println("ch3 : " + ch3);
		// 자료형 char은 음수를 가질 수 없기 때문에 > ? < 가 결과값으로 출력된다.
	}

	public void rule2() {
		int iNum = 10;
		long lNum = 100;

		// int result = iNum + lNum;
		// iNum의 자료형 int가 lNum의 자료형 long으로 자동 형변환되어 계산되어 long형의 결과값이 나오는데
		// result의 자료형은 int 이므로 큰자료형이 작은 자료형으로 들어가기위해서 형변환이 필요하다.

		// iNum + lNum을 int result에 저장할 수 있는 방법
		// 방법 1. 수행결과물 int를 가에 형변환
		int result1 = (int) (iNum + lNum);

		// 방법 2. long형을 int형으로 강제 형변환
		int result2 = iNum + (int) lNum;

		// 번외. 결과값을 저장하는 result를 long형으로 받음
		long result3 = iNum + lNum;

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

	public void rule3() {
		int iNum = 290;
		byte bNum = (byte) iNum; // 데이터 손실
		
		System.out.println("bNum : " + bNum);
	}
}

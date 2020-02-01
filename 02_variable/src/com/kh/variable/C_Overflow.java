package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte) (bNum + 1);
		// 형변환을 안해주면 1은 정수의 기본 자료형인 int로 읽히기 때문에 형변환을 해야한다.
		System.out.println("bNum : " + bNum);
	}

	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;

//		int result = num1 * num2;
		long result = (long)num1 * num2;
		System.out.println("result : " + result);
	}
}

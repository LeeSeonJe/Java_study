package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// && : 피연산자가 모두 true일 때 true 반환 (그리고, ~면서)
	// || : 피연산자 중에서 하나라도 true일 때 true 반환 (또는, ~거나)
	public void method1() {
		// 입력한 정수 값이 1~100사이의 숫자인지 확인
		// 정수 하나 입력 :
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		// 1~100 사이의 숫자
		// 숫자가 1보다 크거나 같고, 100보다 작거나 같다. ==> &&
		System.out.println("1부터 100 사이의 숫자인지 확인 : " + (num >= 1 && num <= 100));
		sc.close();
	}

	public void method2() {
		// 입력한 문자값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);

		boolean isCap = (ch >= 'A' && ch <= 'Z');
//		System.out.println("입력한 문자 값이 대문자인지 확인 : " + (ch >= 'A' && ch <= 'Z'));
		System.out.println("입력한 문자 값이 대문자인지 확인 : " + isCap);

		// 계속 하시려면 y 혹은 Y를 입력하세요 : 
		// 계속 하시겠다고 하셨습니까?

		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요 : ");
		char ch2 = sc.nextLine().charAt(0);
		boolean isCap2 = (ch2 == 'y' || ch2 == 'Y');
		System.out.print("계속 하시겠다고 하셨습니까? " + isCap2);
		
		sc.close();
	}
}

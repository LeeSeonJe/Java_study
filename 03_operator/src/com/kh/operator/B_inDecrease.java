package com.kh.operator;

public class B_inDecrease {
	// 증감연산자 ++ , --
	// ++ : 1식 증가
	// -- : 1씩 감소
	// 값++, 값-- => 후위연산자 - 다른 연산자 계산후에 자기 자신 계산
	// ++값, --값 => 전위연산자 - 자기 자신부터 계산후에 남은 연산자 계산
	public void method1() {
		// 전위 증감 연산자 테스트
		int num1 = 10;
		System.out.println("전위 증감 연산자 적용 전 : " + num1); // 10
		System.out.println("++num1을 1회 수행 후 결과 : " + (++num1)); // 11
		System.out.println("++num1을 2회 수행 후 결과 : " + (++num1)); // 12
		System.out.println("++num1을 3회 수행 후 결과 : " + (++num1)); // 13
		System.out.println("++num1을 4회 수행 후 결과 : " + (++num1)); // 14
		System.out.println("++num1을 5회 수행 후 결과 : " + (++num1)); // 15
		System.out.println("전위 증감 연산 수행 후 num1의 값 : " + num1); // 15
		System.out.println();

		// 후위 증감 연산자 테스트
		int num2 = 10;
		System.out.println("후위 증감 연산자 적용 전 : " + num2); // 10
		System.out.println("num2++을 1회 수행 후 결과 : " + (num2++)); // 10
		System.out.println("num2++을 2회 수행 후 결과 : " + (num2++)); // 11
		System.out.println("num2++을 3회 수행 후 결과 : " + (num2++)); // 12
		System.out.println("num2++을 4회 수행 후 결과 : " + (num2++)); // 13
		System.out.println("num2++을 5회 수행 후 결과 : " + (num2++)); // 14
		System.out.println("후위 증감 연산 수행 후 num2의 값 : " + num2); // 15
	}

	public void method2() {
		int age = 20;

		System.out.println("현재 나이는 ? " + age); // 20
		System.out.println("++age는 ? " + ++age); // 21
		System.out.println("age++는 ? " + age++); // 21
		System.out.println("--age는 ? " + --age); // 21
		System.out.println("age--는 ? " + age--); // 21
		System.out.println("현재 나이는 ? " + age); // 20
	}

	public void method3() {
		int num1 = 20;
		int result = num1++ * 3;
		System.out.println("result : " + result); // 60
		System.out.println("num1 : " + num1); // 21
		System.out.println();

		int num2 = 20;
		int result2 = ++num2 * 3;
		System.out.println("result2 : " + result2); // 63
		System.out.println("num2 : " + num2); // 21
	}

	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a++); // 10
		System.out.println((++a) + (b++)); // 32 // a = 12 , b = 20 > 21
		System.out.println((a++) + (--b) + (--c)); // 61 // a = 12 > 13, b = 20, c = 29

		System.out.println("a = " + a); // 13
		System.out.println("b = " + b); // 20
		System.out.println("c = " + c); // 29
	}
}

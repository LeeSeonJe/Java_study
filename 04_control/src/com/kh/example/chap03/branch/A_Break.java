package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break문을 자기 자신을 포함한 가장 가까운 반복문을 나감
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 문자열을 입력 받아 글자 개수를 출력하는 반복 프로그램
		// 단, end가 입력되면 반복 종료
		// do~while문 사용
		do {
			System.out.println("문자열을 입력 받아 글자 개수를 출력하는 반복 프로그램");
			System.out.println("단, end가 입력되면 반복 종료");
			System.out.print("문자를 입력하세요 : ");
			String str = sc.nextLine();
			if (str.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("문자열의 길이 : " + str.length() + "\n");
		} while (true);
	}

	public void method2() {
		// 1부터 사용자에게 입력 받은 숫자까지의 합 출력
		// for문 사용

		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			if (i >= num) {
				System.out.println(sum);
				break;
			}
		}
	}
}
package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	// 키보드로 문자열 값을 입력 받아 출력 반복 실행
	// 단, exit가 들어오면 반복 종료

	// 문자열 입력 : 안녕하세요
	// str : 안녕하세요
	// 문자열 입력 : apple
	// str : apple
	// 문자열 입력 : exit
	// str : exit
	Scanner sc = new Scanner(System.in);

	public void method1() {
//		String str = "";
		// while문
//		while (!str.equals("exit")) {
//		while (true) {
//			System.out.print("문자열 입력 : ");
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//			if (str.equals("exit")) {
//				break;
//			}
//		}
		String str = null;
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));
	}

	public void method2() {
		int num;
		do {
			System.out.println("1. 테스트1");
			System.out.println("2. 테스트2");
			System.out.println("3. 테스트3");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		} while (num != 9);
	}
}

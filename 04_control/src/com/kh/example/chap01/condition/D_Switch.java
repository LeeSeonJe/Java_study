package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	// 조건식의 결과 값을 case에서 찾아 명령을 수행하는 조건문
	// 해당하는 값이 case에 없을 경우에는 default의 명령문 수행

	// case와 수행문 사이에는 콜론(:)을 써야하며
	// break가 없으면 멈추지 않고 계속 수행함
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 정수 두개와 연산 기호 문자 1개를 입력 받아서
		// 연산기호 문자에 해당하는 계산을 수행하고 출력하세요.

		// 첫번째 값 :
		// 두번째 값 :
		// 연산자 (+,-,*,/) :

		System.out.print("첫번째 값 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
//		java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//		

		System.out.print("연산자 (+, -, *, /) : ");
		char op = sc.nextLine().charAt(0);

		int result = 0;
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("잘못된 수식 입력");
		}
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}

	public void method2() {
		// 과일을 입력하여 사과는 1000, 바나나는 3000, 복숭아는 2000, 키위는 5000,
		// 과일가게에 없는 과일을 입력했을때는 "잘못입력하였습니다." 출력
		// 과일 이름을 입력하시오 :

		System.out.print("과일 이름을 입력하세요 : ");
		String input = sc.nextLine();

		int price = 0;
		switch (input) {
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 3000;
			break;
		case "복숭아":
			price = 2000;
			break;
		case "키위":
			price = 5000;
		default:
			System.out.println("잘못 입력하였습니다.");
			return;
		// 나를 호출한 메소드에게 돌아가는 기능 이때 값을 가지고 돌아갈수도 있고 아무것도 없이 돌아갈수도 있음
		}
		System.out.println(input + "의 가격은 : " + price + "원");
	}

	public void method3() {
		// 사용자가 입력한 메뉴 번호에 따라서 메뉴가 출력되게 하시오.
		// 1. 회원 등록
		// 2. 회원 수정
		// 3. 회원 삭제
		// 메뉴 번호를 입력하세요 :
		System.out.println("1.회원 등록");
		System.out.println("2.회원 수정");
		System.out.println("3.회원 삭제");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("회원등록 메뉴입니다.");
			break;
		case 2:
			System.out.println("회원수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("회원삭제 메뉴입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void method4() {
		// 1월부터 12월까지 입력 받아 해당하는 달의 마지막 날짜를 출력하세요
		// 1월 31일/ 2월 28일/ 3월 31일/ 4월 30일/ 5월 31일/ 6월 30일
		// 7월 31일/ 8월 31일/ 9월 30일/ 10월 31일/ 11월 30일/ 12월 31일
		// 입력하신 달은 00일 까지입니다.
		System.out.print("1월~12월까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int day = 0;
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.println("입력하신 " + num + "월은 " + day + "일 까지입니다.");
	}

}

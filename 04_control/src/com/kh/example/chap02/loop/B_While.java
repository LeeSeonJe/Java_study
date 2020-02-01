package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	// while (조건식) {
	// 실행문장;
	// [증감식 or 분기문;]
	// }

	// 조건식 확인 -> (조건식 true일 때) 실행 문장 수행 -> 조건식 확인 -> (반복)
	// 조건식 결과가 false가 될 때까지 반복
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 1부터 5까지 출력
		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
	}

	public void method1_1() {
		int i = 0;
		while (i < 5) {
			System.out.println("내 이름은 이선제야");
			i++;
		}
	}

	public void method2() {
		// 5부터 1까지 출력
		int i = 5;
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}
	}

	public void method2_1() {
		// 1에서 10사이의 홀수만 출력
		int i = 1;
		while (i < 11) {
			System.out.print(i + " ");
			i += 2;
		}
	}

	public void method3() {
		// 정수 두 개를 입력 받아 그 사이 숫자 출력
		// 정수 두개를 입력하세요.
		// 단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.
		// 첫 번째 숫자 :
		// 두 번째 숫자 :
		System.out.println("정수 두 개를 입력 받아 그 사이 숫자 출력");
		System.out.println("정수 두개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.");
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;
		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}
		while (min <= max) {
			System.out.print(min + " ");
			min++;
		}
	}

	public void method4() {
		// 정수 하나를 입력 받아 그 수가 1~9 사이의 수 일때만 그 수의 구구단 출력
		// 조건에 맞지 않으면 1~9 사이의 양수를 입력하여야합니다. 출력
		System.out.println("정수 하나를 입력 받아 그 수가 1~9 사이의 수 일때만 그 수의 구구단 출력");
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 9 || num <= 1) {
			System.out.println("1~9 사이의 양수를 입력하여야합니다.");
		} else {
			int i = 1;
			while (i < 10) {
				System.out.printf("%d * %d = %d\n", num, i, (num * i));
				i++;
			}
		}
	}

	public void method5() {
		// 1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계 출력
		int num = (int) (Math.random() * 10 + 1);
		int i = 1;
		int result = 0;
		System.out.print(i + "부터 " + num + "까지의 합 : ");
		while (i <= num) {
			result += i;
			i++;
		}
		System.out.println(result);
	}

	public void method6() {
		// 사용자에게 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e

		System.out.println("사용자에게 문자열을 입력 받아 인덱스 별로 문자 출력");
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 문자열의 길이를 반환하는 메소드 : 문자열변수.length();

		// for문
		System.out.println("for문");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}

		// while문
		int i = 0;
		System.out.println("\nwhile문");
		while (i < str.length()) {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}
	}

	public void method7() {
		int i = 2;
		int j = 1;
		while (i < 10) {
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}
	}

	public void method8() {
		// 아날로그 시계 0시 0분 ~ 23시 59분
		// printf 자리 맞춰서 출력하기
		// %nd > n칸 띄고 오른쪽정렬
		// %-nd > n칸 띄고 왼쪽정렬
		int hour = 0;
		while (hour < 24) {
			int minute = 0;
			while (minute < 60) {
				System.out.println(hour + "시 " + minute + "분");
				minute++;
			}
			hour++;
		}
	}

	public void method9() {
		int input = 0;
		while (input != 9) {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();
			switch (input) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("시스템 종료");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			System.out.println();
		}
	}

	public void method10() {
		int input = 9;
		do {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();
			switch (input) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("시스템 종료");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			System.out.println();
		} while (input != 9);
	}
}

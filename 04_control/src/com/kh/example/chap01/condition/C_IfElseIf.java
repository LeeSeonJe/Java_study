package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	// if-else if문
	// if(조건식1){
	// 실행할 문장1;
	// } else if {
	// 실행할 문장2;
	// } else if {
	// 실행할 문장3;
	// } else {
	// 실행할 문장4;
	// }
	// 다중 조건을 줄 수 있는 조건문
	// 조건식1이 true이면 실행할 문장1 수행
	// 조건식2가 true이면 실행할 문장2 수행
	// 조건식3이 true이면 실행할 문장3 수행
	// 아무 조건도 참이 아니면 실행할 문장4 수행
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 키보드로 입력한 숫자가 양수인지 음수인지 출력하시오.
		// '숫자를 한개 입력하세요 : ' 안내멘트 띄운 후 num 변수에 입력한 정수 저장
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		String result;
		if (num > 0) {
			result = "양수다";
		} else if (num == 0) {
			result = "0이다";
		} else {
			result = "음수다";
		}
		System.out.println(result);
	}

	public void method2() {
		// 나이를 입력 받아 13살 이하면 "어린이", 13살 초과 19살 이하면 "청소년", 19살 초과면 "성인" 출력
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		String result;
		if (age <= 13) {
			result = "어린이";
		} else if (age > 19) {
			result = "성인";
		} else {
			result = "청소년";
		}
		System.out.println(result);
	}
}

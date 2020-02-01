package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else문
	// if(조건식) {
	// 실행할 문장1;
	// } else {
	// 실행할 문장2;
	// }
	// 둘 중 한 개를 선택하는 조건문

	// 조건식 결과 값이 true이면 if문 안에 있는 실행할 문장1 수행
	// 조건식 결과 값이 false이면 if문을 빠져나와 else문 안에 있는 실행할 문장2 수행
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		// '숫자 한 개를 입력하세요 : ' 안내문구 출력 후 num 변수에 데이터 저장
		// 짝수이면 "입력하신 숫자는 짝수입니다.", 홀수이면 "입력하신 숫자는 홀수입니다." 출력
		// 프로그램이 끝날 때 "프로그램 종료" 까지 출력 후 프로그램 종료
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.println("프로그램 종료");
	}

	public void method2() {
		// 사용자에게 국어, 영어, 수학 점수를 입력받아서 kor, eng, math 변수에 저장
		// 각 과목 점수가 40점 이상이고 세 과목 평균 점수가 60점 이상일 때 "시험 통과",
		// 한 과목이라도 기준 미달일 때 "시험 불통과" 출력

		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3.0;
		boolean result = (kor >= 40 && eng >= 40 && math >= 40);

		if (result && avg >= 60.0) {
			System.out.println("시험 통과");
		} else {
			System.out.println("시험 불통과");
		}
	}

	public void method3() {
		// 문자열 비교하기
		// boolean java.lang.String.equals(Object object)
		// 사용자에게 이름을 받는데 내가 지정한 이름과 같으면 "본인입니다"
		// 같지 않으면 "본인이 아닙니다" 출력
		// String의 값을 비교할때는 "==" 으로 비교불가 >> String클래스 안에 있는 equals() 메소드를 사용해서 비교
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		if (name.equals("박신우")) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
	}
}

package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항연산자
	// (조건식) ? 식1(true) : 식2(false)
	// 조건식이 true일 때 식1 수행, false일 떄 식2 수행
	public void method1() {
		// 입력한 정수가 양수인지 아닌지 판별
		// 양수면 "양수다", 양수가 아니면 "양수가 아니다"
		// '정수 하나 입력 : '이라는 안내문 출력 후 입력한 정수를 num에 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		String str1 = "양수다.";
		String str2 = "음수다.";

//		String result = num > 0 ? str1 : str2;
		String result = num > 0 ? str1 : (num == 0 ? "0이다" : str2);
		System.out.println(num + " 숫자는 " + result);

		sc.close();
	}

	public void method2() {
		// 입력한 정수가 짝수인지 홀수인지 판별
		// 홀수면 "홀수입니다", 짝수면 "짝수입니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		String str1 = "짝수입니다.";
		String str2 = "홀수입니다.";

//		String result = num % 2 == 0 ? str1 : str2;

//		boolean bool = num % 2 == 0;
//		String result = bool ? str1 : str2;

		int mod = num % 2;
		String result = mod == 0 ? str1 : str2;
		System.out.println(result);

		sc.close();
	}
}

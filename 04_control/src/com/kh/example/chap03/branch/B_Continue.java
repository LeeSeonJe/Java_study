package com.kh.example.chap03.branch;

public class B_Continue {

	// continue 반복문 안에서만 사용 가능
	// continue를 만나면 아래 문장 실행하지 않고
	// 반복문을 다시 시작함
	// for문의 경우 증감식으로 가고, while문의 경우 조건식으로 감

	public void method1() {
		// 1~100까지 정수들의 합계를 출력하되 단, 4의 배수는 빼고 계산
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				continue;
			}
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("합계 : " + sum);
	}

	public void method2() {
		// 구구단 출력 : 짝수 단, 짝수 수 빼고 출력
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			System.out.println();
		}
	}
}
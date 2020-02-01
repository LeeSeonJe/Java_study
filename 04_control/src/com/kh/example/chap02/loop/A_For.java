package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(�ʱ��; ���ǽ�; ������){
	// ������ ����;
	// }

	// �ʱ�� -> ���ǽ� -> (���ǽ��� true�� ��)���๮�� -> ������ -> ���ǽ� -> (�ݺ�)
	// ���ǽ� ����� false�� �� ������ �ݺ�
	// ������ => for���� ������ ���� �ϳ��� ����

	// for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ������ ����
	// ������ ��� ������ �ݺ����� �������� ���� ������
	// for�� ���̳� �ۿ��ٰ� �ʱ���� �������� ������ �������� ������ �󸶳� �ɰ����� ��� ǥ�� �ؾ���
	// ��, for() �ȿ����� ������ �� ��� �ʿ��� �����.

	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 1���� 5���� ���
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "���");
		}
	}

	public void method1_1() {
		// �ڱ� �Ұ� �ټ��� �ϱ� : �� �̸��� �̼�����
		for (int i = 0; i < 5; i++) {
			System.out.println("�� �̸��� �̼�����");
		}
	}

	public void method2() {
		// 5���� 1���� ���
//		for (int i = 5; i > 0; i--) {
//			System.out.println(i + "���");
//		}

		for (int i = 0; i < 5; i++) {
			System.out.println(5 - i);
		}
	}

	public void method2_1() {
		// 8���� 3���� ���
		for (int i = 8; i > 2; i--) {
			System.out.println(i);
		}
	}

	public void method3() {
//		for (int i = 1; i < 11; i += 2) {
//			System.out.println(i);
//		}
		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public void method4() {
		// ���� 2���� �Է� �޾� �� ���� ���� ���
		// ���� �� ���� �Է��ϼ���.
		// ��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ��� :
		// ù ��° ���� :
		// �� ��° ���� :
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();

		int max = 0;
		int min = 0;

		if (start < end) {
			max = end;
			min = start;
		} else {
			min = end;
			max = start;
		}
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
//		for (; min <= max; min++) {
//			System.out.print(min + " ");
//		}
	}

	public void method4_1() {
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9������ ���϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9 ������ ����� �Է��Ͽ����մϴ�" ���
		System.out.print("���� �ϳ� �Է� : ");
		int dan = sc.nextInt();
		if (dan < 10 && dan > 0) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ����մϴ�.");
		}
	}

	public void method5() {
		// 1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
//		System.out.println(Math.random()); // ������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
		// ���� Math.random()�� ���� : 0 <= Math.random() < 1 ����
		// 10���� ����� ���� 10 ���ϱ� : 0 <= (Math.random() * 10) < 10 ����
		// 10�� �����ϱ� ���� 1 ���ϱ� : 1 <= (Math.random() * 10 + 1) < 11
		// ������ ����� ���� int�� ��ȯ : 1 <= (int)(Math.random() * 10 + 1) <11
		int num = (int) (Math.random() * 10 + 1);
//		System.out.println(num);
		int result = 0;
		for (int i = 1; i <= num; i++) {
			result += i;
//			System.out.print(i + " ");
		}
//		System.out.println();
//		System.out.println(result);
		System.out.printf("1���� %d���� ���� �հ� : %d", num, result);
	}

	public void method6() {
		// 2�ܺ��� 9�ܱ��� ���
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	public void method7() {
		// �Ƴ��α� �ð� ��� : 0�� 0�� ~ 23�� 59��
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				System.out.printf("%d�� %d��\n", hour, minute);
			}
		}
	}

	public void method8() {
		// ���ٿ� ��(*)ǥ�� 5�� ��µǴµ�
		// ������ ����ڰ� �Է��� ����ŭ ���
		// ����� �� �� : 3
		// *****
		// *****
		// *****
		System.out.print("����� �� �� : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		// �� �� : 6
		// ĭ �� : 6
		// 1*****
		// *2****
		// **3***
		// ***4**
		// ****5*
		// *****6

		// �� �� : 5
		// ĭ �� : 4
		// 1***
		// *2**
		// **3*
		// ***4
		// ****

		System.out.print("�� �� : ");
		int num1 = sc.nextInt();
		System.out.print("ĭ �� : ");
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				if (i == j) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

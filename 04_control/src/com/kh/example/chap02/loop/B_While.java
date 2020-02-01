package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	// while (���ǽ�) {
	// ���๮��;
	// [������ or �б⹮;]
	// }

	// ���ǽ� Ȯ�� -> (���ǽ� true�� ��) ���� ���� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
	// ���ǽ� ����� false�� �� ������ �ݺ�
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 1���� 5���� ���
		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
	}

	public void method1_1() {
		int i = 0;
		while (i < 5) {
			System.out.println("�� �̸��� �̼�����");
			i++;
		}
	}

	public void method2() {
		// 5���� 1���� ���
		int i = 5;
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}
	}

	public void method2_1() {
		// 1���� 10������ Ȧ���� ���
		int i = 1;
		while (i < 11) {
			System.out.print(i + " ");
			i += 2;
		}
	}

	public void method3() {
		// ���� �� ���� �Է� �޾� �� ���� ���� ���
		// ���� �ΰ��� �Է��ϼ���.
		// ��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		// ù ��° ���� :
		// �� ��° ���� :
		System.out.println("���� �� ���� �Է� �޾� �� ���� ���� ���");
		System.out.println("���� �ΰ��� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
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
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9 ������ �� �϶��� �� ���� ������ ���
		// ���ǿ� ���� ������ 1~9 ������ ����� �Է��Ͽ����մϴ�. ���
		System.out.println("���� �ϳ��� �Է� �޾� �� ���� 1~9 ������ �� �϶��� �� ���� ������ ���");
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num > 9 || num <= 1) {
			System.out.println("1~9 ������ ����� �Է��Ͽ����մϴ�.");
		} else {
			int i = 1;
			while (i < 10) {
				System.out.printf("%d * %d = %d\n", num, i, (num * i));
				i++;
			}
		}
	}

	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1���� ���������� ���� �հ� ���
		int num = (int) (Math.random() * 10 + 1);
		int i = 1;
		int result = 0;
		System.out.print(i + "���� " + num + "������ �� : ");
		while (i <= num) {
			result += i;
			i++;
		}
		System.out.println(result);
	}

	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		// ���ڿ� �Է� : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e

		System.out.println("����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���");
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();

		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� : ���ڿ�����.length();

		// for��
		System.out.println("for��");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}

		// while��
		int i = 0;
		System.out.println("\nwhile��");
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
		// �Ƴ��α� �ð� 0�� 0�� ~ 23�� 59��
		// printf �ڸ� ���缭 ����ϱ�
		// %nd > nĭ ��� ����������
		// %-nd > nĭ ��� ��������
		int hour = 0;
		while (hour < 24) {
			int minute = 0;
			while (minute < 60) {
				System.out.println(hour + "�� " + minute + "��");
				minute++;
			}
			hour++;
		}
	}

	public void method9() {
		int input = 0;
		while (input != 9) {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
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
				System.out.println("�ý��� ����");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		}
	}

	public void method10() {
		int input = 9;
		do {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
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
				System.out.println("�ý��� ����");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		} while (input != 9);
	}
}

package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	// ���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
	// �ش��ϴ� ���� case�� ���� ��쿡�� default�� ��ɹ� ����

	// case�� ���๮ ���̿��� �ݷ�(:)�� ����ϸ�
	// break�� ������ ������ �ʰ� ��� ������
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// ���� �ΰ��� ���� ��ȣ ���� 1���� �Է� �޾Ƽ�
		// �����ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϼ���.

		// ù��° �� :
		// �ι�° �� :
		// ������ (+,-,*,/) :

		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
//		java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//		

		System.out.print("������ (+, -, *, /) : ");
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
			System.out.println("�߸��� ���� �Է�");
		}
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}

	public void method2() {
		// ������ �Է��Ͽ� ����� 1000, �ٳ����� 3000, �����ƴ� 2000, Ű���� 5000,
		// ���ϰ��Կ� ���� ������ �Է��������� "�߸��Է��Ͽ����ϴ�." ���
		// ���� �̸��� �Է��Ͻÿ� :

		System.out.print("���� �̸��� �Է��ϼ��� : ");
		String input = sc.nextLine();

		int price = 0;
		switch (input) {
		case "���":
			price = 1000;
			break;
		case "�ٳ���":
			price = 3000;
			break;
		case "������":
			price = 2000;
			break;
		case "Ű��":
			price = 5000;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return;
		// ���� ȣ���� �޼ҵ忡�� ���ư��� ��� �̶� ���� ������ ���ư����� �ְ� �ƹ��͵� ���� ���ư����� ����
		}
		System.out.println(input + "�� ������ : " + price + "��");
	}

	public void method3() {
		// ����ڰ� �Է��� �޴� ��ȣ�� ���� �޴��� ��µǰ� �Ͻÿ�.
		// 1. ȸ�� ���
		// 2. ȸ�� ����
		// 3. ȸ�� ����
		// �޴� ��ȣ�� �Է��ϼ��� :
		System.out.println("1.ȸ�� ���");
		System.out.println("2.ȸ�� ����");
		System.out.println("3.ȸ�� ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("ȸ����� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("ȸ������ �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("ȸ������ �޴��Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public void method4() {
		// 1������ 12������ �Է� �޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���
		// 1�� 31��/ 2�� 28��/ 3�� 31��/ 4�� 30��/ 5�� 31��/ 6�� 30��
		// 7�� 31��/ 8�� 31��/ 9�� 30��/ 10�� 31��/ 11�� 30��/ 12�� 31��
		// �Է��Ͻ� ���� 00�� �����Դϴ�.
		System.out.print("1��~12������ �� �ϳ��� �Է��ϼ��� : ");
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
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		System.out.println("�Է��Ͻ� " + num + "���� " + day + "�� �����Դϴ�.");
	}

}

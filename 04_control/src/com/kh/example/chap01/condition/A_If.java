package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {

	// �ܵ� if��
	// if(���ǽ�) {
	// ������ ����;
	// }

	// ���ǽ��� ��� ���� true�� {} �ȿ� �ڵ� ����
	// ���ǽ��� ��� ���� false {} �ȿ� �ڵ� �����ϰ� �Ѿ
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// Ű����� �Է��� ���ڰ� ������� �������� ����Ͻÿ�.
		// '���ڸ� �Ѱ� �Է��ϼ��� : ' �ȳ���Ʈ ��� �� num ������ �Է��� ���� ����

		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		}

		if (num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}

		if (num < 0) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}

		System.out.println("���α׷� ����");
		sc.close();
	}

	public void method2() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		// '���� �� ���� �Է��ϼ��� : ' �ȳ����� ��� �� num ������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�." ���
		// ���α׷��� ���� �� "���α׷� ����" ���� ��� �� ���α׷� ����
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}

		if (num % 2 == 1) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}
}

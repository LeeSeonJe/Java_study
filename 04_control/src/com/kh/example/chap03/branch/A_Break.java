package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break���� �ڱ� �ڽ��� ������ ���� ����� �ݺ����� ����
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// ���ڿ��� �Է� �޾� ���� ������ ����ϴ� �ݺ� ���α׷�
		// ��, end�� �ԷµǸ� �ݺ� ����
		// do~while�� ���
		do {
			System.out.println("���ڿ��� �Է� �޾� ���� ������ ����ϴ� �ݺ� ���α׷�");
			System.out.println("��, end�� �ԷµǸ� �ݺ� ����");
			System.out.print("���ڸ� �Է��ϼ��� : ");
			String str = sc.nextLine();
			if (str.equals("end")) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println("���ڿ��� ���� : " + str.length() + "\n");
		} while (true);
	}

	public void method2() {
		// 1���� ����ڿ��� �Է� ���� ���ڱ����� �� ���
		// for�� ���

		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			if (i >= num) {
				System.out.println(sum);
				break;
			}
		}
	}
}
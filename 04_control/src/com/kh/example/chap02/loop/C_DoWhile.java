package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
	// ��, exit�� ������ �ݺ� ����

	// ���ڿ� �Է� : �ȳ��ϼ���
	// str : �ȳ��ϼ���
	// ���ڿ� �Է� : apple
	// str : apple
	// ���ڿ� �Է� : exit
	// str : exit
	Scanner sc = new Scanner(System.in);

	public void method1() {
//		String str = "";
		// while��
//		while (!str.equals("exit")) {
//		while (true) {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//			if (str.equals("exit")) {
//				break;
//			}
//		}
		String str = null;
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));
	}

	public void method2() {
		int num;
		do {
			System.out.println("1. �׽�Ʈ1");
			System.out.println("2. �׽�Ʈ2");
			System.out.println("3. �׽�Ʈ3");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 9:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while (num != 9);
	}
}

package com.kh.variable;

import java.util.Scanner;

public class F_Keyboardinput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ���  : "); // �ȳ� ���� ����
		String name = sc.nextLine(); // ����ڿ��� �Է� ���� �� ���� Ŀ���� �����δ�.

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();

		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double hight = sc.nextDouble();

		System.out.println(name + "���� " + age + "���̸�, Ű�� " + hight + "cm �Դϴ�.");
		sc.close();
	}

	public void inputScanner2() {
		// ����ڿ��� �̸��� ���̸� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");

//		���۹���
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();

//		// �ذ��� 
//		// ��� 1. �ٹٲ��� ������ �� �ִ� nextLine(); �߰�
		int age = sc.nextInt();
		sc.nextLine(); // ���ۿ� ���� �ٹٲ��� ���ִ� ����
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();

//		// ��� 2. age�� �������� nextLine()�� ���� int�� �Ľ��ϱ�.
//		// �Ľ� : ���ڿ��� �⺻ �ڷ����� �ٲ��ִ� ��
//		int age = Integer.parseInt(sc.nextLine()); // => String userAge = sc.nextLine();
//													// int age = Integer.parseInt(userAge);
//
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();

//		// ��� 3. next()�� �ּ� �ޱ�
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next();
//		// next()�� ���⸦ �����ڷ� �����ϱ� ������
//		// ���Ⱑ �� �ּҰ� �� ��� ó�� ���� �տ� ������ �������� ������ ���Եȴ�.

		// + �߰� : char ������ �ް� ���� ��
		System.out.print("������ �Է��ϼ��� : "); // F or M
		char gender = sc.nextLine().charAt(0);
		// nextLine() ���� �޾ƿ� ���ڿ��� �ε��� ��°�� ���ڸ� �������ִ� �޼ҵ�

		System.out.println(name + "���� " + age + "���̰�, ��� ���� " + address + "�Դϴ�.");
		System.out.println("gender : " + gender);
		// ���� �Է� �ް� �Ǹ� ���۶�� �ӽ����� ������ �����̉�
		// nextLine ==> ���ۿ� �ٹٲ��� ������ ����. ���ۿ� �����ִ� �ٹٲ��� �����´�.
		// vs
		// next, nextInt, nextDouble, nextFloat ==> ���ۿ� �ٹٲ��� �����. ���ۿ� ���� �ٹٲ��� �������� �ʴ´�.

		// nextLine�� ������ ������ ���� ���ۿ� \n(�ٹٲ�)�� ����� ���� ������
		// ���� nextLine�� �Է¹ް� �Ǹ� nextLine�� \n�� �״�� ������ ������ �Է¹ް� �Ǿ�
		// ����ڰ� ���� �Է� �ޱ� ���� \n���� �ް� �Ǿ� ������ ������.
		sc.close();
	}
}

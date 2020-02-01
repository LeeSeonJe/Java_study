package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else��
	// if(���ǽ�) {
	// ������ ����1;
	// } else {
	// ������ ����2;
	// }
	// �� �� �� ���� �����ϴ� ���ǹ�

	// ���ǽ� ��� ���� true�̸� if�� �ȿ� �ִ� ������ ����1 ����
	// ���ǽ� ��� ���� false�̸� if���� �������� else�� �ȿ� �ִ� ������ ����2 ����
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		// '���� �� ���� �Է��ϼ��� : ' �ȳ����� ��� �� num ������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�." ���
		// ���α׷��� ���� �� "���α׷� ����" ���� ��� �� ���α׷� ����
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}

	public void method2() {
		// ����ڿ��� ����, ����, ���� ������ �Է¹޾Ƽ� kor, eng, math ������ ����
		// �� ���� ������ 40�� �̻��̰� �� ���� ��� ������ 60�� �̻��� �� "���� ���",
		// �� �����̶� ���� �̴��� �� "���� �����" ���

		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3.0;
		boolean result = (kor >= 40 && eng >= 40 && math >= 40);

		if (result && avg >= 60.0) {
			System.out.println("���� ���");
		} else {
			System.out.println("���� �����");
		}
	}

	public void method3() {
		// ���ڿ� ���ϱ�
		// boolean java.lang.String.equals(Object object)
		// ����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�"
		// ���� ������ "������ �ƴմϴ�" ���
		// String�� ���� ���Ҷ��� "==" ���� �񱳺Ұ� >> StringŬ���� �ȿ� �ִ� equals() �޼ҵ带 ����ؼ� ��
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();

		if (name.equals("�ڽſ�")) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	}
}

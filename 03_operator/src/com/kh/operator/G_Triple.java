package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���׿�����
	// (���ǽ�) ? ��1(true) : ��2(false)
	// ���ǽ��� true�� �� ��1 ����, false�� �� ��2 ����
	public void method1() {
		// �Է��� ������ ������� �ƴ��� �Ǻ�
		// ����� "�����", ����� �ƴϸ� "����� �ƴϴ�"
		// '���� �ϳ� �Է� : '�̶�� �ȳ��� ��� �� �Է��� ������ num�� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		String str1 = "�����.";
		String str2 = "������.";

//		String result = num > 0 ? str1 : str2;
		String result = num > 0 ? str1 : (num == 0 ? "0�̴�" : str2);
		System.out.println(num + " ���ڴ� " + result);

		sc.close();
	}

	public void method2() {
		// �Է��� ������ ¦������ Ȧ������ �Ǻ�
		// Ȧ���� "Ȧ���Դϴ�", ¦���� "¦���Դϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		String str1 = "¦���Դϴ�.";
		String str2 = "Ȧ���Դϴ�.";

//		String result = num % 2 == 0 ? str1 : str2;

//		boolean bool = num % 2 == 0;
//		String result = bool ? str1 : str2;

		int mod = num % 2;
		String result = mod == 0 ? str1 : str2;
		System.out.println(result);

		sc.close();
	}
}

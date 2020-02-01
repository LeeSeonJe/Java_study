package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// && : �ǿ����ڰ� ��� true�� �� true ��ȯ (�׸���, ~�鼭)
	// || : �ǿ����� �߿��� �ϳ��� true�� �� true ��ȯ (�Ǵ�, ~�ų�)
	public void method1() {
		// �Է��� ���� ���� 1~100������ �������� Ȯ��
		// ���� �ϳ� �Է� :
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		// 1~100 ������ ����
		// ���ڰ� 1���� ũ�ų� ����, 100���� �۰ų� ����. ==> &&
		System.out.println("1���� 100 ������ �������� Ȯ�� : " + (num >= 1 && num <= 100));
		sc.close();
	}

	public void method2() {
		// �Է��� ���ڰ��� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);

		boolean isCap = (ch >= 'A' && ch <= 'Z');
//		System.out.println("�Է��� ���� ���� �빮������ Ȯ�� : " + (ch >= 'A' && ch <= 'Z'));
		System.out.println("�Է��� ���� ���� �빮������ Ȯ�� : " + isCap);

		// ��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : 
		// ��� �Ͻðڴٰ� �ϼ̽��ϱ�?

		System.out.print("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
		char ch2 = sc.nextLine().charAt(0);
		boolean isCap2 = (ch2 == 'y' || ch2 == 'Y');
		System.out.print("��� �Ͻðڴٰ� �ϼ̽��ϱ�? " + isCap2);
		
		sc.close();
	}
}

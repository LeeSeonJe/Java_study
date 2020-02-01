package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100;
		// ���� boolean�� true, false�� �����ϰ� �ٸ� ���� �־��� �� ����.(����ȯ�� ��������)

		int num = 'A';
		System.out.println("num : " + num);

		char ch = 97;
		System.out.println("ch : " + ch);

		char ch2 = (char) num;
		System.out.println("ch2 : " + ch2);
		// Type mismatch: cannot convert from int to char
		// ���ͷ��� ��ü�� ��ǻ�Ͱ� �ڵ����� ����ؼ� �־��ְ� ������ �� ���� �ڷ����� ũ�⸸�� ���� ������ ����ȯ�� �̷�� �����Ѵ�.
		int num2 = -97;
		char ch3 = (char) num2;
		System.out.println("ch3 : " + ch3);
		// �ڷ��� char�� ������ ���� �� ���� ������ > ? < �� ��������� ��µȴ�.
	}

	public void rule2() {
		int iNum = 10;
		long lNum = 100;

		// int result = iNum + lNum;
		// iNum�� �ڷ��� int�� lNum�� �ڷ��� long���� �ڵ� ����ȯ�Ǿ� ���Ǿ� long���� ������� �����µ�
		// result�� �ڷ����� int �̹Ƿ� ū�ڷ����� ���� �ڷ������� �������ؼ� ����ȯ�� �ʿ��ϴ�.

		// iNum + lNum�� int result�� ������ �� �ִ� ���
		// ��� 1. �������� int�� ���� ����ȯ
		int result1 = (int) (iNum + lNum);

		// ��� 2. long���� int������ ���� ����ȯ
		int result2 = iNum + (int) lNum;

		// ����. ������� �����ϴ� result�� long������ ����
		long result3 = iNum + lNum;

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

	public void rule3() {
		int iNum = 290;
		byte bNum = (byte) iNum; // ������ �ս�
		
		System.out.println("bNum : " + bNum);
	}
}

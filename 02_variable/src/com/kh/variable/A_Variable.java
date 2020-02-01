package com.kh.variable;

public class A_Variable {// Ŭ����

	public void declareVeariable() { // �޼ҵ�
		// ���� ���� �� �ʱ�ȭ
		// A. ���� ���� : �ڷ��� ������;

		// 1. ���� boolean
		boolean isTrue;

		// 2. ������
		// 2_1. ����
		char ch;
		// 2_2. ���ڿ�
		String str;

		// 3. ����
		// 3_1. ����
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 3_2. �Ǽ�
		float fNum;
		double dNum;

		// B. �ʱ�ȭ : ������ = ��;

		isTrue = true;
		ch = 'A'; // 1 ����
		str = "A"; // 1~n ����
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
//		fNum = 4.0; 
//		Type mismatch: cannot convert from double to float
//		: 4.0�� �Ǽ��ε� �⺻������ �Ǽ��� double�� �⺻���̱� ������ 4.0�� float�� �ƴ� double������ ��������
//		  but fNum�� float���̰� �⺻���� double���̱� ������ 4byte ũ�� �ȿ� 8byte�� ���� �� ���� ������ �����߻�
		fNum = 4.0f;
		dNum = 8.0;
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
	}

	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ
		// 1. ����
		boolean isTrue = false;
		// 2. ������
		// 2_1. ����
		char ch = 'B';
		// 2_2. ���ڿ�
		String str = "Hello";
		// 3. ������
		// 3_1. ������
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		// 3_2. �Ǽ���
		float fNum = 4.0f;
		double dNum = 8.0d;

		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
	}
}

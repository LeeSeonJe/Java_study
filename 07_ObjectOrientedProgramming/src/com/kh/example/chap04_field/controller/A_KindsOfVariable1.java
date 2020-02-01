package com.kh.example.chap04_field.controller;

/*Ŭ������ public, default*/
public class A_KindsOfVariable1 { // <-- Ŭ���� ������ ����
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ� == ������� == ����ʵ� == ��������
	// public, protected, default, public
	private int globalNum;

	public void method1(int num) { // <-- �޼ҵ� ������ ����
//						�� �Ű����� : �޼ҵ��� ����� �� ��ȣ �ȿ� �����ϴ� ����

		// �޼ҵ� �������� �ۼ��ϴ� ���� : ��������
		int localNum = 10;
		// �Ű����� ���� ���������� �������� ������

		System.out.println(localNum);
		// The local variable localNum may not have been initialized
		// ���������� �ݵ�� �ʱ�ȭ�� �Ǿ� �־�� �Ѵ�.

		System.out.println(num);
		// �Ű������� ���� �޾ƿ��� ���̹Ƿ� ���� �Ѿ�� num�� ������ �Ǳ⶧���� �ʱ�ȭ������ ����.

		System.out.println(globalNum);
	} // <-- �޼ҵ� ������ ��

	public void method2() {
		/* System.out.println(localNum); */
		// ���������� �ش� ���� �������� ��� ����
		System.out.println(globalNum);
	}

} // <-- Ŭ���� ������ ��

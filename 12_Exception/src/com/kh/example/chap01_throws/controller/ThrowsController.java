package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("�޼ҵ�1 ȣ�� ��...");
		method2();
		System.out.println("�޼ҵ�1 ���� ��...");
	}

	public void method2() throws Exception {
		System.out.println("�޼ҵ�2 ȣ�� ��...");
		method3();
		System.out.println("�޼ҵ�2 ���� ��...");
	}

	public void method3() throws Exception {
		System.out.println("�޼ҵ�3 ȣ�� ��...");
		throw new Exception(); // ���������� Exception�߻�
//		System.out.println("�޼ҵ�3 ���� ��...");
		// ������ �߻��ϸ� ������ ���� �Ǳ� ������ ���� �߻� �Ʒ��� ������� ������� ����
		// ���� ������ �� ���� �ڵ�, �ǹ� ���� �ڵ��� ���� �� �ߴ� ��
	}
}

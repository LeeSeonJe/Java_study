package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTset {
	// �Ű������� ������ ��ȯ �� ������ ���� ����
	// 1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void method1() {
//		      ��ȯ ��x     �Ű�����x
		System.out.println("�Ű������� ��ȯ �� �Ѵ� ���� �޼ҵ��Դϴ�.");
		// �ȿ� ��ɸ� �����ϰ� ���ϰ� ��ȯ���� ����
	}

	// 2. �Ű����� ���� ��ȯ �� �ִ� �޼ҵ�
	public int method2() {
//		   ��ȯ ��o      �Ű�����x
//		This method must return a result of type int
//		�� �޼ҵ�� �ݵ�� intŸ�� ����� ���ϰ��� �������Ѵ�.
//		return 0;
		int i = 10;
		return i;
	}

	// 3. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
//		     ��ȯ ��x          �Ű����� ��o
		System.out.println(num1);
		System.out.println(num2);
		int sum = num1 + num2;
		System.out.println(sum);
	}

	// 4. �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
//		     ��ȯ ��o		    	�Ű����� ��o 
		return num1 + num2;
	}

	// ��ȭ 1. ��ȯ ���� �迭�� ���
	// ��ȭ 2. ��ȯ ���� Ŭ������ ���
	public int[] method5() {
		int[] iArr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);
		return iArr;
	}

	public User method6() {
		User user = new User("user01", "pass01", "�̼���");
		System.out.println("MethodTest user : " + user);
		return user;
	}
}

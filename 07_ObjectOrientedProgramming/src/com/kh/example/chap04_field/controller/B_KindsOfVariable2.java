package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	public static int staticNum;

	private int testNum = 10; // ��ü�� �����ؼ� �޸� ������ �ö󰡴� ������ �ν��Ͻ� ��
	private static int staticTestNum = 10; // ��ü ���� ���� static �޸𸮿� �ٷ� �ö󰥼� �ִ� Ŭ���� ����

	public B_KindsOfVariable2() { // ������
		testNum++;
		System.out.println("test : " + testNum);

		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
}

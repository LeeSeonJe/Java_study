package com.kh.test;

public class MethodPrinter {
	public void methodA() {
		System.out.println("methodA ȣ��");
		methodB();
		System.out.println("methodA ��ȯ");
	}

	public void methodB() {
		System.out.println("methodB ȣ��");
//		return;
		methodC();
//		return;
		System.out.println("methodB ��ȯ");
	}

	public void methodC() {
		System.out.println("methodC ȣ��");
		System.out.println("methodC ��ȯ");
	}
}

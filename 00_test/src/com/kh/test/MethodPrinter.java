package com.kh.test;

public class MethodPrinter {
	public void methodA() {
		System.out.println("methodA 호출");
		methodB();
		System.out.println("methodA 반환");
	}

	public void methodB() {
		System.out.println("methodB 호출");
//		return;
		methodC();
//		return;
		System.out.println("methodB 반환");
	}

	public void methodC() {
		System.out.println("methodC 호출");
		System.out.println("methodC 반환");
	}
}

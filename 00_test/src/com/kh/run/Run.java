package com.kh.run;

import com.kh.test.MethodPrinter;

public class Run {

	public static void main(String[] args) {
		System.out.println("main 메소드 실행");
		MethodPrinter mp = new MethodPrinter();
		mp.methodA();
//		return;
		System.out.println("main 메소드 종료");
	}
}

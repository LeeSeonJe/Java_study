package com.kh.example.chap02_tryCatch.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("메소드1 호출 됨...");
		try {
			method2();
			System.out.println("예외 발생 시에 출력될까? ㄴㄴ 출력 안됌 ==> method2()에서 예외발생해서 catch문으로 넘어감");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception으로 잡음");
		} finally {
			System.out.println("예외 발생 여부와 상관 없이 무적권 수행됨");
		}
		System.out.println("메소드1 종료 됨...");
	}

	public void method2() throws IOException {
		System.out.println("메소드2 호출 됨...");
		method3();
		System.out.println("메소드2 종료 됨...");
	}

	public void method3() throws IOException {
		System.out.println("메소드3 호출 됨...");
		throw new IOException("IOException을 강제로 발생시켰습니다.");
//		System.out.println("메소드3 종료 됨...");
	}

	public void test() {
		try {
			FileOutputStream f = new FileOutputStream("a.xls");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

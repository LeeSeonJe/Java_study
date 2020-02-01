package com.kh.example.chap02_tryCatch.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("�޼ҵ�1 ȣ�� ��...");
		try {
			method2();
			System.out.println("���� �߻� �ÿ� ��µɱ�? ���� ��� �ȉ� ==> method2()���� ���ܹ߻��ؼ� catch������ �Ѿ");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception���� ����");
		} finally {
			System.out.println("���� �߻� ���ο� ��� ���� ������ �����");
		}
		System.out.println("�޼ҵ�1 ���� ��...");
	}

	public void method2() throws IOException {
		System.out.println("�޼ҵ�2 ȣ�� ��...");
		method3();
		System.out.println("�޼ҵ�2 ���� ��...");
	}

	public void method3() throws IOException {
		System.out.println("�޼ҵ�3 ȣ�� ��...");
		throw new IOException("IOException�� ������ �߻����׽��ϴ�.");
//		System.out.println("�޼ҵ�3 ���� ��...");
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

package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
//		int a = bkv.staticNum;
//		The static field B_KindsOfVariable2.staticNum should be accessed in a static way
//		System.out.println(a);

//		int a1 = B_KindsOfVariable2.staticNum;
		// Ŭ������.������;
//		System.out.println(a1);

//									  �� ������
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
//								  �� new������

		Product p = new Product();
		p.inform();
		// JVM �⺻�� : null, null, 0, 0
		// ����� �ʱ�ȭ : ��������, ������, 1500, 100
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 90

		Product p2 = new Product();
		p2.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 80

		Product p3 = new Product();
		p3.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 70
	}
}

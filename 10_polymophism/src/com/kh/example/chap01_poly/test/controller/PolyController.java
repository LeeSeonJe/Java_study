package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method() {
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		Parent p = new Parent();
//		�� �θ� Ÿ�� ���۷���   �� �θ� ��ü
		p.printParent();
		System.out.println();

		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
//		�� �ڽ� Ÿ�� ���۷��� 	�� �ڽ� ��ü
		c1.printChild1();
		c1.printParent();
		System.out.println();

		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");

		// �� ĳ���� = ��� ���迡 �ִ� �θ�, �ڽ� Ŭ���� ���� �θ�Ÿ���� ������ ������ ��� �ڽ� Ÿ���� ��ü �ּҸ� ���� �� ����
		// �θ�Ÿ���� ������ ������ ��� �ڽİ�ü�� ���� �� �ִ� ��
		Parent p2 = new Child2(); // ������
		Parent p3 = new Child1(); // ������
		p2.printParent();

//		((Child2) p3).printChild2(); // �ٿ� ĳ����
		System.out.println();

		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
//		Child2 c2 = new Parent(); // �θ�ü�� �ڽİ�ü�� ���� �� ����
		System.out.println();
		System.out.println("==== ���� ���� ====");

		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

		for (int i = 0; i < pArr.length; i++) {
			if (pArr[i] instanceof Child1) {
				((Child1) pArr[i]).printChild1();
			} else if (pArr[i] instanceof Child2) {
				((Child2) pArr[i]).printChild2();
			}
		}

		for (int i = 0; i < pArr.length; i++) {
			pArr[i].print();
		}
	}
}

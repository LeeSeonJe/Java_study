package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		Person[] pArr = new Person[5];

		System.out.println("pArr : " + pArr);

		for (int i = 0; i < pArr.length; i++) {
			System.out.println("parr[" + i + "] : " + pArr[i]);
		}

		// �� �ε��� ���� ��ü�� �����Ͽ� �����ϱ�
		pArr[0] = new Person("���ǰ�", 20, '��', 175.8, 66.9);
		pArr[1] = new Person("�̼���", 27, '��', 179.2, 83.4);
		pArr[2] = new Person("�����", 14, '��', 190.0, 77.3);
		pArr[3] = new Person("�����", 27, '��', 161.4, 56.8);
		pArr[4] = new Person("���̹�", 53, '��', 157.9, 58.3);

		for (int i = 0; i < pArr.length; i++) {
			System.out.println("parr[" + i + "] : " + pArr[i].personInfo());
		}

		Person seonje = new Person("������", 26, '��', 164.3, 48.6);
		System.out.println(seonje.personInfo());
	}

	public void method2() {
		Person[] pArr = { new Person("���ǰ�", 20, '��', 175.8, 66.9), new Person("�̼���", 27, '��', 179.2, 83.4),
				new Person("�����", 14, '��', 190.0, 77.3), new Person("�����", 27, '��', 161.4, 56.8),
				new Person("���̹�", 53, '��', 157.9, 58.3) };

		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName() + "���� ���� : " + pArr[i].personInfo());
		}
	}
}

package com.kh.example.chap02_abstractNInterface.family.controller;

import com.kh.example.chap02_abstractNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Basic;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Family;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family(); 
//		Cannot instantiate the type Family : �߻� Ŭ������ ��ü ���� �Ұ�
		Family f1 = new Mother("��Ӵ�", 50, 70, "���");
		Family f2 = new Baby("���̺�", 3.5, 70);

		System.out.println(f1);
		System.out.println(f2);

		Basic b1 = new Mother("��Ӵ�", 50, 70, "���");
		Basic b2 = new Baby("���̺�", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
	}
}

package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	public void method() {
		System.out.println("ParentŬ������ num�ʵ� ����");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent �ȿ� �ִ� num : " + p.getNum());

		System.out.println();

		System.out.println("Child1Ŭ������ str�ʵ� ����");
		Child1 c = new Child1();
		c.setStr("Hello");
		System.out.println("Child1 �ȿ� �ִ� str : " + c.getStr());

		System.out.println("Child1Ŭ������ num�ʵ� ����");
		c.setNum(99);
		System.out.println("Child1 �ȿ� �ִ� num : " + c.getNum());
		System.out.println();

		System.out.println("Child2Ŭ������ str�ʵ� ����");
		Child2 c2 = new Child2();
		c2.setStr("Would");
		System.out.println("Child2 �ȿ� �ִ� str : " + c2.getStr());

		System.out.println("\nChild2Ŭ������ ��ӹ��� Parent�� �ʵ� ����");
//		c2.num; 
//		�θ�Ŭ������ ParentŬ������ num�� priavate�� ����Ǿ� �־ ���ٺҰ�
		c2.setNum(999);
		System.out.println("Child2 �ȿ� �ִ� num : " + c2.getNum());

//		�θ�Ŭ������ �ִ� ���� ������� �ʴ´�. ����Ǿ� ���� �ʰ� �����ޱ⸸ �Ѵ�.
		System.out.println("Parent �ȿ� �ִ� num : " + p.getNum());
	}
}

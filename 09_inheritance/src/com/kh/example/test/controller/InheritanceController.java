package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	public void method() {
		System.out.println("Parent클래스의 num필드 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : " + p.getNum());

		System.out.println();

		System.out.println("Child1클래스의 str필드 접근");
		Child1 c = new Child1();
		c.setStr("Hello");
		System.out.println("Child1 안에 있는 str : " + c.getStr());

		System.out.println("Child1클래스의 num필드 접근");
		c.setNum(99);
		System.out.println("Child1 안에 있는 num : " + c.getNum());
		System.out.println();

		System.out.println("Child2클래스의 str필드 접근");
		Child2 c2 = new Child2();
		c2.setStr("Would");
		System.out.println("Child2 안에 있는 str : " + c2.getStr());

		System.out.println("\nChild2클래스가 상속받은 Parent의 필드 접근");
//		c2.num; 
//		부모클래스인 Parent클래스의 num은 priavate로 선언되어 있어서 접근불가
		c2.setNum(999);
		System.out.println("Child2 안에 있는 num : " + c2.getNum());

//		부모클래스에 있는 값은 변경되지 않는다. 연결되어 있지 않고 물려받기만 한다.
		System.out.println("Parent 안에 있는 num : " + p.getNum());
	}
}

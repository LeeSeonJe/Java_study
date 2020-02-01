package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p = new Parent();
//		↑ 부모 타입 레퍼런스   ↑ 부모 객체
		p.printParent();
		System.out.println();

		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
//		↑ 자식 타입 레퍼런스 	↑ 자식 객체
		c1.printChild1();
		c1.printParent();
		System.out.println();

		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");

		// 업 캐스팅 = 상속 관계에 있는 부모, 자식 클래스 간에 부모타입의 참조형 변수가 모든 자식 타입의 객체 주소를 받을 수 있음
		// 부모타입의 참조형 변수가 모든 자식객체를 받을 수 있는 것
		Parent p2 = new Child2(); // 다형성
		Parent p3 = new Child1(); // 다형성
		p2.printParent();

//		((Child2) p3).printChild2(); // 다운 캐스팅
		System.out.println();

		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
//		Child2 c2 = new Parent(); // 부모객체를 자식객체에 넣을 수 없다
		System.out.println();
		System.out.println("==== 간단 예제 ====");

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

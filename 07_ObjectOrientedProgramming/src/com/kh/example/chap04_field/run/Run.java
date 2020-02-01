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
		// 클래스명.변수명;
//		System.out.println(a1);

//									  ↓ 생성자
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
//								  ↑ new연산자

		Product p = new Product();
		p.inform();
		// JVM 기본값 : null, null, 0, 0
		// 명시적 초기화 : 초코파이, 오리온, 1500, 100
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 90

		Product p2 = new Product();
		p2.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 80

		Product p3 = new Product();
		p3.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 70
	}
}

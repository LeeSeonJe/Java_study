package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		// 객체의 주소가 담긴 변수 == 레퍼런스, 참조
//		The constructor User() is undefined
//		매개 변수 있는 생성자를 만든 상태에서 기본 생성자를 지웠을 때 나는 에러

		u1.inform();

		User u2 = new User("asd","asdf");
		
		u2.inform();
		
		User u3 = new User("asdf","asdfasdf","a9u235");
		u3.inform();
	}
}

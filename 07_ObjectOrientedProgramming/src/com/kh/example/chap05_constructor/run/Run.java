package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		// ��ü�� �ּҰ� ��� ���� == ���۷���, ����
//		The constructor User() is undefined
//		�Ű� ���� �ִ� �����ڸ� ���� ���¿��� �⺻ �����ڸ� ������ �� ���� ����

		u1.inform();

		User u2 = new User("asd","asdf");
		
		u2.inform();
		
		User u3 = new User("asdf","asdfasdf","a9u235");
		u3.inform();
	}
}

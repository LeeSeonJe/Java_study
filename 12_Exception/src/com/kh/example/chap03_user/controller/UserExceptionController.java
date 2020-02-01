package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	Scanner sc = new Scanner(System.in);

	public void inputAge() {
		// 나이를 입력하세요 라는 문구가 뜨고 거기에 사용자가 나이를 입력하면 age변수에 입력받은 값 저장
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		try {
			checkAge(age);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	public void checkAge(int age) throws MyException {
		if (age < 19) {
			throw new MyException("입장불가");
		} else {
			System.out.println("즐거운 감상~");
		}
	}
}

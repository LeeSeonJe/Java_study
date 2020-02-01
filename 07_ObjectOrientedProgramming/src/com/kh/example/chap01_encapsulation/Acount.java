package com.kh.example.chap01_encapsulation;

public class Acount { // default 클래스로 만들지 않고 기본적으로 "무적권" pubilc class
	// 클래스 영역 => 안에 있는 변수는 "멤버 변수(필드, 멤버 필드, 전역 변수)"
	private String name = "이선제";
	private String phone = "010-9901-4052";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; // 잔액

	// 입금 메소드
	public void deposit(int money) { // 매개 변수 ==> 외부/내부에서 넘기고 싶은 값을 받아오는 역할
		// 메소드 영역 => 안에 있는 변수는 "지역 변수"
		if (money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}

	// 출금 메소드
	public void withdraw(int money) {
		if (money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}

	// 잔액 조회 메소드
	public void displayBalance() {
		System.out.println(name + "님의 계좌에 잔액은 " + balance + "원입니다.");
	}
}

//class test() { 
//	class 밑에 클래스를 만들때 default 클래스를 사용
//}

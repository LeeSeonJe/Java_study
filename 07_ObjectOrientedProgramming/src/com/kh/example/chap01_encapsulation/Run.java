package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Acount a = new Acount();
		a.deposit(1000000);
		a.displayBalance();

		a.deposit(1500000);
		a.displayBalance();

		a.withdraw(500000);
		a.displayBalance();

//		a.balance -= 2000000;
		// The field Account.balance is not visible
		// Account(클래스명).balance(변수명)이 보이지 않는다.

		// private는 나 자신(클래스,Account)에서만 볼 수 있게 제한해주기 때문에
		// 외부 클래스인 Run에서는 볼 수 없음.

		a.withdraw(500000);
		a.displayBalance();
	}
}
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
		// Account(Ŭ������).balance(������)�� ������ �ʴ´�.

		// private�� �� �ڽ�(Ŭ����,Account)������ �� �� �ְ� �������ֱ� ������
		// �ܺ� Ŭ������ Run������ �� �� ����.

		a.withdraw(500000);
		a.displayBalance();
	}
}
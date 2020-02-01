package com.kh.example.chap01_encapsulation;

public class Acount { // default Ŭ������ ������ �ʰ� �⺻������ "������" pubilc class
	// Ŭ���� ���� => �ȿ� �ִ� ������ "��� ����(�ʵ�, ��� �ʵ�, ���� ����)"
	private String name = "�̼���";
	private String phone = "010-9901-4052";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; // �ܾ�

	// �Ա� �޼ҵ�
	public void deposit(int money) { // �Ű� ���� ==> �ܺ�/���ο��� �ѱ�� ���� ���� �޾ƿ��� ����
		// �޼ҵ� ���� => �ȿ� �ִ� ������ "���� ����"
		if (money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}

	// ��� �޼ҵ�
	public void withdraw(int money) {
		if (money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}

	// �ܾ� ��ȸ �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ���¿� �ܾ��� " + balance + "���Դϴ�.");
	}
}

//class test() { 
//	class �ؿ� Ŭ������ ���鶧 default Ŭ������ ���
//}

package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	// if-else if��
	// if(���ǽ�1){
	// ������ ����1;
	// } else if {
	// ������ ����2;
	// } else if {
	// ������ ����3;
	// } else {
	// ������ ����4;
	// }
	// ���� ������ �� �� �ִ� ���ǹ�
	// ���ǽ�1�� true�̸� ������ ����1 ����
	// ���ǽ�2�� true�̸� ������ ����2 ����
	// ���ǽ�3�� true�̸� ������ ����3 ����
	// �ƹ� ���ǵ� ���� �ƴϸ� ������ ����4 ����
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// Ű����� �Է��� ���ڰ� ������� �������� ����Ͻÿ�.
		// '���ڸ� �Ѱ� �Է��ϼ��� : ' �ȳ���Ʈ ��� �� num ������ �Է��� ���� ����
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		String result;
		if (num > 0) {
			result = "�����";
		} else if (num == 0) {
			result = "0�̴�";
		} else {
			result = "������";
		}
		System.out.println(result);
	}

	public void method2() {
		// ���̸� �Է� �޾� 13�� ���ϸ� "���", 13�� �ʰ� 19�� ���ϸ� "û�ҳ�", 19�� �ʰ��� "����" ���
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();

		String result;
		if (age <= 13) {
			result = "���";
		} else if (age > 19) {
			result = "����";
		} else {
			result = "û�ҳ�";
		}
		System.out.println(result);
	}
}

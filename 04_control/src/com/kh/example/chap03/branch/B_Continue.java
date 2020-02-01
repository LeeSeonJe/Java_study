package com.kh.example.chap03.branch;

public class B_Continue {

	// continue �ݺ��� �ȿ����� ��� ����
	// continue�� ������ �Ʒ� ���� �������� �ʰ�
	// �ݺ����� �ٽ� ������
	// for���� ��� ���������� ����, while���� ��� ���ǽ����� ��

	public void method1() {
		// 1~100���� �������� �հ踦 ����ϵ� ��, 4�� ����� ���� ���
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				continue;
			}
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("�հ� : " + sum);
	}

	public void method2() {
		// ������ ��� : ¦�� ��, ¦�� �� ���� ���
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			System.out.println();
		}
	}
}
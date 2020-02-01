package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
//	���� ���� : �迭�� �ּҸ� ����
//	���� ���� : ������ ���ο� �迭�� �����Ͽ� ���� ���� �� ����
//		1) for���� �̿��� 1:1����
//		2) System.arraycopy() �޼ҵ带 �̿��� ����
//		3) Arrays.copyOf() �޼ҵ带 �̿��� ����
//		4) clone() �޼ҵ带 �̿��� ���� 

	public void method1() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = originArr; // ���� ����
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

		copyArr[2] = 1000;
		originArr[1] = 100;

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		System.out.println("originArr : " + originArr);
		System.out.println("copyArr   : " + copyArr);
	}

	public void method2() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[5];
		for (int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i]; // ���� ����
		}

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

//		originArr[0] �迭 �� ����
		originArr[0] = 99;

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}

	public void method3() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[10];

//					 	     �����迭 ������ġ	   ����迭 ������ġ
//		System.arraycopy(src, srcPos, dest, destPos, length);
//						�����迭		   ����迭			   �������

//		originArr�迭�� ��� �����͸� copyArr�迭�� ���縦 �ϴµ�
//		copyArr�� 3 �ε������� �ٿ��ְ� ����
		System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		originArr[0] = 99;
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}

	public void method4() {
//		���� ���� 3 : Arrays.copyOf() �޼ҵ� ���
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[10];

		System.out.println("====== ó�� �� ======");
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
//		Arrays.copyOf(original, newLength)
//					        �����迭 	   ������ ����

		copyArr = Arrays.copyOf(originArr, originArr.length);
		// �迭�� ����Ҷ� �����ϰ� ����� �� �ִ� ��ɵ��� ��Ƴ��� Ŭ����
		
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}
}

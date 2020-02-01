package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method1() {
		// 변수의 두 값 변경하기
		int num1 = 10;
		int num2 = 20;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		int temp = 0; // 임시로 값을 저장할 변수 생성

		temp = num1; // temp = 10
		num1 = num2; // num1 = 20
		num2 = temp; // num2 = 10
		System.out.println();
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		int[] arr = { 2, 1, 3 };
		int temp2;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void method2() {
		int[] iArr = { 2, 5, 4, 6, 1, 3 };
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		Arrays.sort(iArr); // 기본적으로 sort 메소드가 제공하는 정렬은 오름차순만 제공

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
	}
}

package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
//	얕은 복사 : 배열의 주소만 복사
//	깊은 복사 : 동일한 새로운 배열을 생성하여 실제 내부 값 복사
//		1) for문을 이용한 1:1복사
//		2) System.arraycopy() 메소드를 이용한 복사
//		3) Arrays.copyOf() 메소드를 이용한 복사
//		4) clone() 메소드를 이용한 복사 

	public void method1() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = originArr; // 얕은 복사
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
			copyArr[i] = originArr[i]; // 깊은 복사
		}

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

//		originArr[0] 배열 값 변경
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

//					 	     원본배열 시작위치	   복사배열 시작위치
//		System.arraycopy(src, srcPos, dest, destPos, length);
//						원본배열		   복사배열			   복사길이

//		originArr배열의 모든 데이터를 copyArr배열에 복사를 하는데
//		copyArr의 3 인덱스부터 붙여넣고 싶음
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
//		깊은 복사 3 : Arrays.copyOf() 메소드 사용
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[10];

		System.out.println("====== 처음 값 ======");
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
//		Arrays.copyOf(original, newLength)
//					        원본배열 	   복사할 길이

		copyArr = Arrays.copyOf(originArr, originArr.length);
		// 배열을 사용할때 유용하게 사용할 수 있는 기능들을 모아놓은 클래스
		
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}
}

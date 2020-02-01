package com.kh.variable;

import java.util.Scanner;

public class F_Keyboardinput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요  : "); // 안내 문구 역할
		String name = sc.nextLine(); // 사용자에게 입력 받을 때 까지 커서가 깜빡인다.

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		System.out.print("키(소수점 첫째 자리까지 입력) : ");
		double hight = sc.nextDouble();

		System.out.println(name + "님은 " + age + "세이며, 키는 " + hight + "cm 입니다.");
		sc.close();
	}

	public void inputScanner2() {
		// 사용자에게 이름과 나이를 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");

//		버퍼문제
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();

//		// 해결방법 
//		// 방법 1. 줄바꿈을 가져갈 수 있는 nextLine(); 추가
		int age = sc.nextInt();
		sc.nextLine(); // 버퍼에 남은 줄바꿈을 빼주는 역할
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();

//		// 방법 2. age를 받을때도 nextLine()을 쓰되 int로 파싱하기.
//		// 파싱 : 문자열을 기본 자료형을 바꿔주는 일
//		int age = Integer.parseInt(sc.nextLine()); // => String userAge = sc.nextLine();
//													// int age = Integer.parseInt(userAge);
//
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();

//		// 방법 3. next()로 주소 받기
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next();
//		// next()는 띄어쓰기를 구분자로 생각하기 때문에
//		// 띄어쓰기가 들어간 주소가 들어간 경우 처음 띄어쓰기 앞에 데이터 값까지만 가지고 오게된다.

		// + 추가 : char 형으로 받고 싶을 때
		System.out.print("성별을 입력하세요 : "); // F or M
		char gender = sc.nextLine().charAt(0);
		// nextLine() 에서 받아온 문자열의 인덱스 번째의 문자를 가져와주는 메소드

		System.out.println(name + "님은 " + age + "세이고, 사는 곳은 " + address + "입니다.");
		System.out.println("gender : " + gender);
		// 값을 입력 받게 되면 버퍼라는 임시적인 공간에 저장이됌
		// nextLine ==> 버퍼에 줄바꿈을 남기지 않음. 버퍼에 남아있는 줄바꿈을 가져온다.
		// vs
		// next, nextInt, nextDouble, nextFloat ==> 버퍼에 줄바꿈을 남긴다. 버퍼에 남긴 줄바꿈을 가져오지 않는다.

		// nextLine을 제외한 나머지 들은 버퍼에 \n(줄바꿈)을 남기고 오기 때문에
		// 다음 nextLine을 입력받게 되면 nextLine은 \n을 그대로 가져와 값으로 입력받게 되어
		// 사용자가 값을 입력 받기 전에 \n값을 받게 되어 실행을 끝낸다.
		sc.close();
	}
}

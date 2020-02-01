package com.kh.variable;

public class E_PrintMethod {
	// 모든 영역에 들어갈 수 있는 변수 = 전역변수
	// class 영역에 선언된 변수이기 때문에 class 영역안에 있는 메소드에 변수를 호출해서 사용이 가능하다
	String str1 = "안녕하세요"; // 전역변수
	String str2 = "반갑습니다"; // 전역변수

	public void printExample() {
//		String str1 = "안녕하세요"; //지역변수
//		String str2 = "반갑습니다"; //지역변수
		System.out.print(str1);
		System.out.print(str2);
	}

	public void printlnExample() {
//		String str1 = "안녕하세요"; //지역변수
//		String str2 = "반갑습니다"; //지역변수
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("aaa");
	}

	public void printfExample() {
		// 안녕하세요, 저는 이선제입니다. 반갑습니다
//		System.out.printf("%s, 박신우입니다. %s.",str1,str2);

		// 반갑습니다, 친하게 지내요.
		System.out.printf("%s, 친하게 지내요.", str2);
		System.out.println();

		// 미니 문제
		// 안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
		int age = 20;
		String name = "박신우";
		String job = "강사";

		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.", str1, age, name, job, str2);

	}
}

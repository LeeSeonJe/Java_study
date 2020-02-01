package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");

		// Heap영역에 있는 String pool(=Literal pool, Constant pool)영역에 값을 저장
		// 같은 값이 들어오면 같은 내용을 참조하기때문에 str1과 str2의 주소는 동일
		// 하지만 new String을 통해서 객체를 생성해주면 Heap영역에 새로 생성되기 때문에 값이 같지만 일치하지 않다.

		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3));
		System.out.println("===============================");
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		System.out.println("===============================");
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str3));

		str2 += "oracle";
		System.out.println("===============================");
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str3));
	}

	public void method2() {
		// StringBuffer Test
		// 계속해서 값을 변경해야할 때 String같은 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에
		// 가비지 컬렉터가 계속 지워야하는 단점이 있는 (불편이라는 특징 때문)
		// 변경이 적고 읽기만 하는 경우에는 불변 클래스인 String클래스가 용이하겠지만
		// 변경해야하는 값이 많은 경우 StringBuffer나 StringBulider로 하는게 더 효율적임

		StringBuffer buffer1 = new StringBuffer();
		System.out.println("===============================");
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어있는 실제 값의 길이 : " + buffer1.length());
		System.out.println();
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제값 길이 : " + buffer2.length());
		System.out.println();

		// 기본 16문자 크기 + abc만큼의 크기 3
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제값 길이 : " + buffer3.length());
		System.out.println();

		StringBuilder builder = new StringBuilder("abc");
		System.out.println("초기 builder의 수용량 : " + builder.capacity());
		System.out.println("builder에 들어있는 실제값 길이 : " + builder.length());
		System.out.println();
		System.out.println("===============================");
		builder.append("abc");
		System.out.println("abc 추가 후의 builder : " + builder);
		System.out.println("abc 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("abc 추가 후의 builder 길이 :  " + builder.length());

		builder.append("def");
		System.out.println("def 추가 후의 builder : " + builder);
		System.out.println("def 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("def 추가 후의 builder 길이 :  " + builder.length());

		// 메소르 체이닝
//		builder.append("abc").append("def");

		System.out.println("abc, def 추가 후의 builder : " + builder);
		System.out.println("abc, def 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("abc, def 추가 후의 builder 길이 : " + builder.length());

		System.out.println();
		builder.insert(2, "zzz");
		System.out.println("인덱스 2에 zzz 추가후의 builder : " + builder);

		// start 크거나 같고 end보다 작다. java에 한에서만
		builder.delete(2, 5);
		System.out.println("인덱스 2부터 5까지 삭제 후의 builder : " + builder);
		System.out.println();

		builder.reverse();
		System.out.println("reverse 후의 builder : " + builder);

		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
//		abyyczzz
//		zcyyba
		System.out.println(sb);
	}

	public void method3() {
		String str = "Hello World";

//		1. charAt(int, index):char
//			 - String의 index번째 char반환
		char ch = str.charAt(4);
		System.out.println(ch);

//		2. concat(String str):String
//			 - 매개변수로 들어온 값을 원래 String의 끝에 이어붙인 값(String)을 반환
//			 - += 과 동일
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		str += "!!!";
		System.out.println("concatStr : " + concatStr);

//		3. equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));

//		4. substring(int beginIndex):String
//		   substring(int beginIndex, int endIndex):String
//			 - String의 일부를 반환  - 매개변수가 하나면, 그 인덱스부터 끝까지 반환
//                              - 매개변수가 두개면, 시작인텍스부터 끝 인덱스 전까지 반환
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("str.substring(0, 5) : " + str.substring(0, 5));

//		5. replace(char oldCharm char newChar):String
//			 - 지정 char를 새로운 char로 대체하여 반환
		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));

//		6. toUpperCase()/toLowerCase():String
//			 - 모두 대문자 혹은 소문자로 바꿔 반환
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());

//		7. equalsIgnoreCase():boolean
//			 - 대소문자 구분하지 않고 확인하는 것
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));

//		8. trim():String
//			 - 앞뒤에 있는 공백(빈 공간)을 제거한 문자열 반환
		String str4 = "        java";
		String str5 = "java 		";
		String str6 = "		java		";
		System.out.println(str4 + "| str4.trim() : " + str4.trim());
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
		System.out.println(str6 + "| str6.trim() : " + str6.trim());

//		9. split(String str):String[]
//			 - 문자열을 분리하여 배열에 담아 반환
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("분리된 문자열 개수(split) : " + splitArr.length);
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		System.out.println();

		// 향상된 for문(for-each문)
		for (String s : splitArr) {
			System.out.println(s);
		}

	}

	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer stObj = new StringTokenizer(str, ", ");

		System.out.println("분리된 문자열 개수 : " + stObj.countTokens());
		while (stObj.hasMoreElements()) {
			System.out.println(stObj.nextToken());
		}

		System.out.println("값을 꺼낸 후의 문자열 개수 : " + stObj.countTokens());
		System.out.println();

		String str2 = "Apple, Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer strObj2 = new StringTokenizer(str2, ", -*#");

		System.out.println("분리된 문자열 개수 : " + strObj2.countTokens());
		while (strObj2.hasMoreElements()) {
			System.out.println(strObj2.nextToken());
		}

//		split()과 StringTokenizer의 차이점
//		1.  분리한 문자열을 String[]로 처리하고 싶을 때 split()메소드
//			분리한 문자열을 객체로 처리하고 싶을 때 StringTokenizer클래스
//		2.  split()메소드의 구분자는 1개
//			StringTokenizer클래스의 구분자는 여러 개

	}
}

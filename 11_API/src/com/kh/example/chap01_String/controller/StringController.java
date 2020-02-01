package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");

		// Heap������ �ִ� String pool(=Literal pool, Constant pool)������ ���� ����
		// ���� ���� ������ ���� ������ �����ϱ⶧���� str1�� str2�� �ּҴ� ����
		// ������ new String�� ���ؼ� ��ü�� �������ָ� Heap������ ���� �����Ǳ� ������ ���� ������ ��ġ���� �ʴ�.

		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2));
		System.out.println("str1�� str3�� �ּҴ� ������? : " + (str1 == str3));
		System.out.println("===============================");
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		System.out.println("===============================");
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str3));

		str2 += "oracle";
		System.out.println("===============================");
		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str3));
	}

	public void method2() {
		// StringBuffer Test
		// ����ؼ� ���� �����ؾ��� �� String���� ��� ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������
		// ������ �÷��Ͱ� ��� �������ϴ� ������ �ִ� (�����̶�� Ư¡ ����)
		// ������ ���� �б⸸ �ϴ� ��쿡�� �Һ� Ŭ������ StringŬ������ �����ϰ�����
		// �����ؾ��ϴ� ���� ���� ��� StringBuffer�� StringBulider�� �ϴ°� �� ȿ������

		StringBuffer buffer1 = new StringBuffer();
		System.out.println("===============================");
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ����ִ� ���� ���� ���� : " + buffer1.length());
		System.out.println();
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer2�� ����ִ� ������ ���� : " + buffer2.length());
		System.out.println();

		// �⺻ 16���� ũ�� + abc��ŭ�� ũ�� 3
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());
		System.out.println("buffer3�� ����ִ� ������ ���� : " + buffer3.length());
		System.out.println();

		StringBuilder builder = new StringBuilder("abc");
		System.out.println("�ʱ� builder�� ���뷮 : " + builder.capacity());
		System.out.println("builder�� ����ִ� ������ ���� : " + builder.length());
		System.out.println();
		System.out.println("===============================");
		builder.append("abc");
		System.out.println("abc �߰� ���� builder : " + builder);
		System.out.println("abc �߰� ���� builder �뷮 : " + builder.capacity());
		System.out.println("abc �߰� ���� builder ���� :  " + builder.length());

		builder.append("def");
		System.out.println("def �߰� ���� builder : " + builder);
		System.out.println("def �߰� ���� builder �뷮 : " + builder.capacity());
		System.out.println("def �߰� ���� builder ���� :  " + builder.length());

		// �޼Ҹ� ü�̴�
//		builder.append("abc").append("def");

		System.out.println("abc, def �߰� ���� builder : " + builder);
		System.out.println("abc, def �߰� ���� builder �뷮 : " + builder.capacity());
		System.out.println("abc, def �߰� ���� builder ���� : " + builder.length());

		System.out.println();
		builder.insert(2, "zzz");
		System.out.println("�ε��� 2�� zzz �߰����� builder : " + builder);

		// start ũ�ų� ���� end���� �۴�. java�� �ѿ�����
		builder.delete(2, 5);
		System.out.println("�ε��� 2���� 5���� ���� ���� builder : " + builder);
		System.out.println();

		builder.reverse();
		System.out.println("reverse ���� builder : " + builder);

		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
//		abyyczzz
//		zcyyba
		System.out.println(sb);
	}

	public void method3() {
		String str = "Hello World";

//		1. charAt(int, index):char
//			 - String�� index��° char��ȯ
		char ch = str.charAt(4);
		System.out.println(ch);

//		2. concat(String str):String
//			 - �Ű������� ���� ���� ���� String�� ���� �̾���� ��(String)�� ��ȯ
//			 - += �� ����
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		str += "!!!";
		System.out.println("concatStr : " + concatStr);

//		3. equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));

//		4. substring(int beginIndex):String
//		   substring(int beginIndex, int endIndex):String
//			 - String�� �Ϻθ� ��ȯ  - �Ű������� �ϳ���, �� �ε������� ������ ��ȯ
//                              - �Ű������� �ΰ���, �������ؽ����� �� �ε��� ������ ��ȯ
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("str.substring(0, 5) : " + str.substring(0, 5));

//		5. replace(char oldCharm char newChar):String
//			 - ���� char�� ���ο� char�� ��ü�Ͽ� ��ȯ
		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));

//		6. toUpperCase()/toLowerCase():String
//			 - ��� �빮�� Ȥ�� �ҹ��ڷ� �ٲ� ��ȯ
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());

//		7. equalsIgnoreCase():boolean
//			 - ��ҹ��� �������� �ʰ� Ȯ���ϴ� ��
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));

//		8. trim():String
//			 - �յڿ� �ִ� ����(�� ����)�� ������ ���ڿ� ��ȯ
		String str4 = "        java";
		String str5 = "java 		";
		String str6 = "		java		";
		System.out.println(str4 + "| str4.trim() : " + str4.trim());
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
		System.out.println(str6 + "| str6.trim() : " + str6.trim());

//		9. split(String str):String[]
//			 - ���ڿ��� �и��Ͽ� �迭�� ��� ��ȯ
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("�и��� ���ڿ� ����(split) : " + splitArr.length);
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		System.out.println();

		// ���� for��(for-each��)
		for (String s : splitArr) {
			System.out.println(s);
		}

	}

	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer stObj = new StringTokenizer(str, ", ");

		System.out.println("�и��� ���ڿ� ���� : " + stObj.countTokens());
		while (stObj.hasMoreElements()) {
			System.out.println(stObj.nextToken());
		}

		System.out.println("���� ���� ���� ���ڿ� ���� : " + stObj.countTokens());
		System.out.println();

		String str2 = "Apple, Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer strObj2 = new StringTokenizer(str2, ", -*#");

		System.out.println("�и��� ���ڿ� ���� : " + strObj2.countTokens());
		while (strObj2.hasMoreElements()) {
			System.out.println(strObj2.nextToken());
		}

//		split()�� StringTokenizer�� ������
//		1.  �и��� ���ڿ��� String[]�� ó���ϰ� ���� �� split()�޼ҵ�
//			�и��� ���ڿ��� ��ü�� ó���ϰ� ���� �� StringTokenizerŬ����
//		2.  split()�޼ҵ��� �����ڴ� 1��
//			StringTokenizerŬ������ �����ڴ� ���� ��

	}
}

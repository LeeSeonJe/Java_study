package com.kh.variable;

public class E_PrintMethod {
	// ��� ������ �� �� �ִ� ���� = ��������
	// class ������ ����� �����̱� ������ class �����ȿ� �ִ� �޼ҵ忡 ������ ȣ���ؼ� ����� �����ϴ�
	String str1 = "�ȳ��ϼ���"; // ��������
	String str2 = "�ݰ����ϴ�"; // ��������

	public void printExample() {
//		String str1 = "�ȳ��ϼ���"; //��������
//		String str2 = "�ݰ����ϴ�"; //��������
		System.out.print(str1);
		System.out.print(str2);
	}

	public void printlnExample() {
//		String str1 = "�ȳ��ϼ���"; //��������
//		String str2 = "�ݰ����ϴ�"; //��������
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("aaa");
	}

	public void printfExample() {
		// �ȳ��ϼ���, ���� �̼����Դϴ�. �ݰ����ϴ�
//		System.out.printf("%s, �ڽſ��Դϴ�. %s.",str1,str2);

		// �ݰ����ϴ�, ģ�ϰ� ������.
		System.out.printf("%s, ģ�ϰ� ������.", str2);
		System.out.println();

		// �̴� ����
		// �ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
		int age = 20;
		String name = "�ڽſ�";
		String job = "����";

		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.", str1, age, name, job, str2);

	}
}

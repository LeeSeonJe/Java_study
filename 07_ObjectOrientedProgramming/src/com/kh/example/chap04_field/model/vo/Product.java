package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "��������";
	private String brand = "������";
	private int price = 1500;
	private static int num = 100;

	static {
//		name = "Ȩ����";
//		brand = "����";
//		price = 2000;
//		�����ñⰡ �޶� ���Ұ� 
//			==> static�� ���� �޸� ������ �����ǰ� �ν��Ͻ� ������ 
//				��ü �����ÿ� �޸𸮿� �ö󰡱� ������
		num = 150;
		num--;
//		���α׷� ���� �� �� ���� �ʱ�ȭ
	}

	{
		name = "ĭ��";
		price = 1000;
		brand = "�Ե�";
		num -= 10;
//		��ü ������ ���� �ʱ�ȭ
	}

	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}
}

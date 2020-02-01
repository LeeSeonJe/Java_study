package com.kh.example.chap03_syne.run;

import com.kh.example.chap03_syne.resource.Resources;
import com.kh.example.chap03_syne.thread.Customer;
import com.kh.example.chap03_syne.thread.Product;

public class Run {
	public static void main(String[] args) {
		Resources resources = new Resources();

		Thread t1 = new Product(resources);
		Thread t2 = new Customer(resources);

		t1.start();
		t2.start();
//		java.lang.IllegalMonitorStateException
//		wait() �� ����ȭ ��� / ����ȭ�޼ҵ� �ȿ��� ���Ǿ�� �ϴµ� 
//		�Ϲ� �޼ҵ� �ȿ��� ���Ǿ��� ������ �ߴ� ����
	}
}

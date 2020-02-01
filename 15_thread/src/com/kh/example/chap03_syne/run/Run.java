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
//		wait() 가 동기화 블록 / 동기화메소드 안에서 사용되어야 하는데 
//		일반 메소드 안에서 사용되었기 때문에 뜨는 에러
	}
}

package com.kh.example.chap03_syne.thread;

import com.kh.example.chap03_syne.resource.Resources;

// �����ڿ��� ������ ����ϴ� �Һ��� Ŭ����
public class Customer extends Thread {
	private Resources criticalData;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Resources resources) {
		this.criticalData = resources;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			criticalData.getData();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package com.kh.example.chap03_syne.thread;

import com.kh.example.chap03_syne.resource.Resources;

public class Product extends Thread {
	private Resources criticalData;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Resources resources) {
		this.criticalData = resources;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			criticalData.setDate(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

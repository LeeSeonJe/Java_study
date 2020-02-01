package com.kh.example.chap03_syne.resource;

public class Resources {
	private int data;
	private boolean empty = true; // data에 값이 없을 때 true

	public synchronized void getData() {
		while (empty) { // data필드의 값이 없다면
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty = true;
		System.out.println("소비자 : " + data + "번 상품을 소비하였습니다.");
		notify();
	}

	public synchronized void setDate(int data) {
		while (!empty) { // data필드에 값이 있다면
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		empty = false;
		System.out.println("생산자 : " + data + "번 상품을 생산하였습니다.");
		notify();
	}
}

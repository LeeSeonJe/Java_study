package com.kh.example.chap03_syne.resource;

public class Resources {
	private int data;
	private boolean empty = true; // data�� ���� ���� �� true

	public synchronized void getData() {
		while (empty) { // data�ʵ��� ���� ���ٸ�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty = true;
		System.out.println("�Һ��� : " + data + "�� ��ǰ�� �Һ��Ͽ����ϴ�.");
		notify();
	}

	public synchronized void setDate(int data) {
		while (!empty) { // data�ʵ忡 ���� �ִٸ�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		empty = false;
		System.out.println("������ : " + data + "�� ��ǰ�� �����Ͽ����ϴ�.");
		notify();
	}
}

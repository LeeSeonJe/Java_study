package com.kh.example.chap01_thread.thread;

// ������ ������� 2 : Runnable implements �ϱ�
public class Thread2 implements Runnable {

	@Override
	public void run() {
//		Thread.currentThread().setName("���� ������");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

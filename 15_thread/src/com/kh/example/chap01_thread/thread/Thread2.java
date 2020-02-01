package com.kh.example.chap01_thread.thread;

// 스레드 생성방법 2 : Runnable implements 하기
public class Thread2 implements Runnable {

	@Override
	public void run() {
//		Thread.currentThread().setName("못난 스레드");
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

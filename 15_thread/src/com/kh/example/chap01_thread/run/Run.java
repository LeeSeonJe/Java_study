package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
//		t1.start();
//		=================================
		Thread2 t2 = new Thread2();
		Thread thread = new Thread(t2);
//		thread.start();
//		=================================
		Thread3 t3 = new Thread3();
//		t3.start();

//		t1.start();
//		java.lang.IllegalThreadStateException
//		�ѹ� ����� ������� �ٽ� ȣ�� �Ұ���

		System.out.println("t1 �켱���� : " + t1.getPriority());
		System.out.println("t2 �켱���� : " + thread.getPriority());
		System.out.println("t3 �켱���� : " + t3.getPriority());

		t1.setPriority(3);
		thread.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);

		System.out.println("t1 �켱���� : " + t1.getPriority());
		System.out.println("t2 �켱���� : " + thread.getPriority());
		System.out.println("t3 �켱���� : " + t3.getPriority());

		t1.start();
		thread.start();
		t3.start();

		// ���� �����尡 ������ ��µǰ� �ϱ� ==> join() ���
		try {
			t1.join();
			thread.join();
			t3.join();
			// �ڽ�(main thread ���� ����Ǵ� ��ġ)�� �ϴ� �۾��� ��� ���߰� �ٸ� ������(t1, thread, t3)�� ������ �ð����� ���� �ǵ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------- main end!");
	}
}

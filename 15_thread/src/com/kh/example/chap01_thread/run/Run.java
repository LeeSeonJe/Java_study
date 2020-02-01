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
//		한번 종료된 스레드는 다시 호출 불가능

		System.out.println("t1 우선순위 : " + t1.getPriority());
		System.out.println("t2 우선순위 : " + thread.getPriority());
		System.out.println("t3 우선순위 : " + t3.getPriority());

		t1.setPriority(3);
		thread.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);

		System.out.println("t1 우선순위 : " + t1.getPriority());
		System.out.println("t2 우선순위 : " + thread.getPriority());
		System.out.println("t3 우선순위 : " + t3.getPriority());

		t1.start();
		thread.start();
		t3.start();

		// 위에 스레드가 끝나고 출력되게 하기 ==> join() 사용
		try {
			t1.join();
			thread.join();
			t3.join();
			// 자신(main thread 내가 실행되는 위치)이 하던 작업을 잠시 멈추고 다른 스레드(t1, thread, t3)가 지정된 시간동안 실행 되도록함
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------- main end!");
	}
}

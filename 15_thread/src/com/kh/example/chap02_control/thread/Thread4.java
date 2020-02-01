package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable {
	public void run() {
		int count = 0;
		// count가 10 미만이면서, 현재 스레드의 interrupted가 false인 경우
		// 인터럽트 ==> 일시 정지된 스레드를 깨워서 실행 대기로 만들어 주는 것
		while (count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "초");
			} catch (InterruptedException e) {
				// 인터럽트가 발생하여 익셉션이 발생하여 print문이 출력된다.
				// 인터럽티드 익셉션이 발생하면 isInterrupted()가 중간에 true를 바뀌었어도
				// InterruptedException을 만나면 다시 isInterrupted() false로 초기화 시킴
				// while 조건문에 걸려서 반복문 계속 실행
				System.out.println(count + "초에 카운트 종료");
				Thread.currentThread().interrupt(); // 현재 스레드에 인터럽트 발생
			}
		}
	}
}

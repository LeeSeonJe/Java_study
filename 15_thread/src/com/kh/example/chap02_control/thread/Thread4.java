package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable {
	public void run() {
		int count = 0;
		// count�� 10 �̸��̸鼭, ���� �������� interrupted�� false�� ���
		// ���ͷ�Ʈ ==> �Ͻ� ������ �����带 ������ ���� ���� ����� �ִ� ��
		while (count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "��");
			} catch (InterruptedException e) {
				// ���ͷ�Ʈ�� �߻��Ͽ� �ͼ����� �߻��Ͽ� print���� ��µȴ�.
				// ���ͷ�Ƽ�� �ͼ����� �߻��ϸ� isInterrupted()�� �߰��� true�� �ٲ���
				// InterruptedException�� ������ �ٽ� isInterrupted() false�� �ʱ�ȭ ��Ŵ
				// while ���ǹ��� �ɷ��� �ݺ��� ��� ����
				System.out.println(count + "�ʿ� ī��Ʈ ����");
				Thread.currentThread().interrupt(); // ���� �����忡 ���ͷ�Ʈ �߻�
			}
		}
	}
}

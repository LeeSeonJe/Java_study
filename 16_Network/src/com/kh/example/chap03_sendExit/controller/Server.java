package com.kh.example.chap03_sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void startServer() {
		// 1. ������ ��Ʈ ��ȣ ����
		int port = 8500;

		try {
			// 2. Server
			ServerSocket server = new ServerSocket(port);
			// 3. Ŭ���̾�Ʈ�κ��� ��û�� �ö����� ���
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�....");

			// 4. ���� ��û�� ���� accept()�޼ҵ�� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��....");

			// 5. ����� ��Ʈ�� ����
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();

			// 6. ������Ʈ���� ���� ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);

			// 7. ��Ʈ���� ���� �а� ����

			while (true) {
				String message = br.readLine();
				if (!message.equals("exit")) {
					System.out.println(clientIP + "�� ���� �޼��� : " + message);
					pw.println("�޼��� �ޱ� ����");
					pw.flush();
				} else {
					System.out.println("���� ����");
					break;
				}
			}
			// 8. ��� ����
			br.close();
			pw.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

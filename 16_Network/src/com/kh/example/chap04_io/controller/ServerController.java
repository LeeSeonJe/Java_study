package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	public void startServer() {
		// 1. ���� ��Ʈ��ȣ ����
		int port = 8500;

		try {
			// 2. ������ ���� ��ü ���� (ServerSocket)
			ServerSocket server = new ServerSocket(port);
			// 3. Ŭ���̾�Ʈ�ʿ��� ���� ��û�� ��ٸ�
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��..........");
			// 4. ���� ��û�� ���� ��û ����(accept()�޼ҵ�) �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();

			// 5. ����½�Ʈ�� ����
			// 6. ���� ��Ʈ������ ���� ����
			InputStream in = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(in);

			// 7. �б� ����
			Person message = null;
			while (true) {
				message = (Person) ois.readObject();
				if (message != null) {
					System.out.println(client.getInetAddress().getHostAddress() + "�� ���� �޼��� : " + message);
				} else {
					break;
				}
			}
			// 8. ��� ����
			ois.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

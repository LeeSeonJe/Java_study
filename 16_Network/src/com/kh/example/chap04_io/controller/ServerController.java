package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	public void startServer() {
		// 1. 서버 포트번호 지정
		int port = 8500;

		try {
			// 2. 서버용 소켓 객체 생성 (ServerSocket)
			ServerSocket server = new ServerSocket(port);
			// 3. 클리이언트쪽에서 접속 요청을 기다림
			System.out.println("클라이언트의 요청을 기다리는 중..........");
			// 4. 접속 요청이 오면 요청 수락(accept()메소드) 후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();

			// 5. 입출력스트림 생성
			// 6. 보조 스트림으로 성능 개선
			InputStream in = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(in);

			// 7. 읽기 쓰기
			Person message = null;
			while (true) {
				message = (Person) ois.readObject();
				if (message != null) {
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메세지 : " + message);
				} else {
					break;
				}
			}
			// 8. 통신 종료
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

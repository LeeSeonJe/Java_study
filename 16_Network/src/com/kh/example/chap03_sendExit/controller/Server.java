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
		// 1. 서버용 포트 번호 지정
		int port = 8500;

		try {
			// 2. Server
			ServerSocket server = new ServerSocket(port);
			// 3. 클라이언트로부터 요청이 올때까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다....");

			// 4. 접속 요청이 오면 accept()메소드로 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "가 연결을 요청함....");

			// 5. 입출력 스트림 생성
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();

			// 6. 보조스트림을 통해 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);

			// 7. 스트림을 통해 읽고 쓰기

			while (true) {
				String message = br.readLine();
				if (!message.equals("exit")) {
					System.out.println(clientIP + "가 보낸 메세지 : " + message);
					pw.println("메세지 받기 성공");
					pw.flush();
				} else {
					System.out.println("접속 종료");
					break;
				}
			}
			// 8. 통신 종료
			br.close();
			pw.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

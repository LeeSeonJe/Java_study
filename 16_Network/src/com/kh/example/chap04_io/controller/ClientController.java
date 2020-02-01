package com.kh.example.chap04_io.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.kh.example.chap04_io.model.vo.Person;

public class ClientController {
	public ClientController() {
		// 객체를 파일로 만들기 위한 Stream 구현(파일이름 : person.txt)
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));) {
			ArrayList<Person> list = new ArrayList<Person>();
			list.add(new Person("박신우", 20));
			list.add(new Person("강건강", 30));
			list.add(new Person("남나눔", 25));

			for (Person p : list) {
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void startClient() {
		// 1. 서버의 IP주소와 포트번호를 매개변수로한 클라이언트용 소켓 객체 생성
		try {
			String server = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(server, 8500);
			if (socket != null) { // 연결안됨
				// 2. 입출력 스트림 생성
				// 3. 보조스트림을 통해 성능 개선
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				// 4. 읽고 쓰기
				try {
					while (true) {
						Person p = (Person) ois.readObject();
						oos.writeObject(p);
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EOFException e) {
					// EOFException이 발생했다 ? ==> 문서의 끝에 도달했다.
					oos.writeObject(null);
					oos.flush();
					// 5. 통신 종료
					ois.close();
					oos.close();
					socket.close();
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

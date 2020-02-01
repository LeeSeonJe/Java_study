package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			// Unhandled exception type FileNotFoundException
//			while (fis.read() != -1) {
//				System.out.print((char) fis.read() + " ");
//			}
			int value;
			while ((value = fis.read()) != -1) {
				System.out.print((char) value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void fileSave() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a_byte.txt"); // 이렇게만 쓰면 같은 이름으로 계속계속 덮어씀
//			FileWriter(File file, boolean append)
//			Constructs a FileWriter object given a File object.
//			매개변수로 boolean 값을 하나 더 주면 뒤에 이어 붙일 수 있는 append 가능 

			// write(int b):void
			fos.write(97);
//			Unhandled exception type IOException
//			입력과 출력을 할때 제대로 입력하지 않거나 문법에 맞지 않으면 발생
			// write(byte[] b):void
			byte[] bArr = { 98, 99, 100, 101, 102, 103 };
			fos.write(bArr);
			fos.write(bArr, 1, 3);
			// 1 index부터 3개 : cde
		} catch (FileNotFoundException e) {
//			exception간의 상속 관계 고려
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// 스트림을 열고 사용하고 나면 닫아줘야한다.
				// 스트림이 많을 경우 닫아주지 않으면 꼬일 수 있으므로 닫아주도록 하자.
				// 무조건 수행되는 finally 안에 넣자.
			}
		}
	}
}

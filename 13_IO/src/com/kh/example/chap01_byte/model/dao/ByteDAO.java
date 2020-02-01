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
			fos = new FileOutputStream("a_byte.txt"); // �̷��Ը� ���� ���� �̸����� ��Ӱ�� ���
//			FileWriter(File file, boolean append)
//			Constructs a FileWriter object given a File object.
//			�Ű������� boolean ���� �ϳ� �� �ָ� �ڿ� �̾� ���� �� �ִ� append ���� 

			// write(int b):void
			fos.write(97);
//			Unhandled exception type IOException
//			�Է°� ����� �Ҷ� ����� �Է����� �ʰų� ������ ���� ������ �߻�
			// write(byte[] b):void
			byte[] bArr = { 98, 99, 100, 101, 102, 103 };
			fos.write(bArr);
			fos.write(bArr, 1, 3);
			// 1 index���� 3�� : cde
		} catch (FileNotFoundException e) {
//			exception���� ��� ���� ���
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// ��Ʈ���� ���� ����ϰ� ���� �ݾ�����Ѵ�.
				// ��Ʈ���� ���� ��� �ݾ����� ������ ���� �� �����Ƿ� �ݾ��ֵ��� ����.
				// ������ ����Ǵ� finally �ȿ� ����.
			}
		}
	}
}

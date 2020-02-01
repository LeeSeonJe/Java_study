package com.kh.example.chap00_file.model.dao;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();

			File f2 = new File("c:/test/test.txt");
			f2.createNewFile();

			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
//			f4.createNewFile();
			f3.mkdirs();
			f4.createNewFile();
			f4.delete();

			System.out.println(f2.exists()); // ������ �����ϴ���
			System.out.println(f3.exists());
			System.out.println(f3.isFile()); // �������� �ƴ���

			System.out.println("���� �� : " + f1.getName());
			System.out.println("���� ���� ��� : " + f1.getAbsolutePath()); // �� ������ �����ϴ� ��������ġ
			System.out.println("���� ��� ��� : " + f1.getPath()); // �� ��ġ�� ���� ��ȭ�ϴ� ��ġ
			System.out.println("���� �뷮 : " + f1.length());
			System.out.println("f1 ���� ���� : "+f1.getParent()); 
			System.out.println("f4 ���� ���� : "+f4.getParent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

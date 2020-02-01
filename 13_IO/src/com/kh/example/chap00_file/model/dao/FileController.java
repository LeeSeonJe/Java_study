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

			System.out.println(f2.exists()); // 파일이 존재하는지
			System.out.println(f3.exists());
			System.out.println(f3.isFile()); // 파일인지 아닌지

			System.out.println("파일 명 : " + f1.getName());
			System.out.println("저장 절대 경로 : " + f1.getAbsolutePath()); // 그 파일이 존재하는 절대적위치
			System.out.println("저장 상대 경로 : " + f1.getPath()); // 내 위치에 따라서 변화하는 위치
			System.out.println("파일 용량 : " + f1.length());
			System.out.println("f1 상위 폴더 : "+f1.getParent()); 
			System.out.println("f4 상위 폴더 : "+f4.getParent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

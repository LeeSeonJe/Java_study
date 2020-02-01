package com.kh.example.chap03_assist.part02_object.model.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class objectDAO {
	public void fileSave() {
		Member[] mArr = new Member[3];
		mArr[0] = new Member("user01", "pass01", "홍길동", "hong777@kh.org", 25, '남', 1250.7);
		mArr[1] = new Member("user02", "pass02", "유관순", "you31@kh.org", 17, '여', 1221.6);
		mArr[2] = new Member("user03", "pass03", "이순신", "lee888@kh.org", 22, '남', 1234.6);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object_member.txt"));) {
			for (int i = 0; i < mArr.length; i++) {
				oos.writeObject(mArr[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fileOpen() {
//		입력과 출력 
//		입력은 파일을 불러오는 것 inputStream, Reader
//		출력은 파일을 내보내는 것 outputStream, writer
//		만약에 직렬화를 통해서 데이터가 객채로 만들어져 저장된 파일을 불러오고 싶으면 
//		보조스트림 ObjectInputStream 을 사용하고 불러올 기반 스트림은 
//		뒤에가 같은 FileInputStream을 사용해서 불러와야 한다.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object_member.txt"));) {
			Member[] mArr = new Member[3];
			for (int i = 0; i < mArr.length; i++) {
				mArr[i] = (Member) ois.readObject();
			}

			for (Member m : mArr) {
				System.out.println(m);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

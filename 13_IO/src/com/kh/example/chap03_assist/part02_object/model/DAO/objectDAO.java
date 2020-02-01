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
		mArr[0] = new Member("user01", "pass01", "ȫ�浿", "hong777@kh.org", 25, '��', 1250.7);
		mArr[1] = new Member("user02", "pass02", "������", "you31@kh.org", 17, '��', 1221.6);
		mArr[2] = new Member("user03", "pass03", "�̼���", "lee888@kh.org", 22, '��', 1234.6);

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
//		�Է°� ��� 
//		�Է��� ������ �ҷ����� �� inputStream, Reader
//		����� ������ �������� �� outputStream, writer
//		���࿡ ����ȭ�� ���ؼ� �����Ͱ� ��ä�� ������� ����� ������ �ҷ����� ������ 
//		������Ʈ�� ObjectInputStream �� ����ϰ� �ҷ��� ��� ��Ʈ���� 
//		�ڿ��� ���� FileInputStream�� ����ؼ� �ҷ��;� �Ѵ�.
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

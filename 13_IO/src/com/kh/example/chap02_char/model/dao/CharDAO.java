package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
//		FileWriter fw = null;
		try (FileWriter fw = new FileWriter("b_char.txt")) {
//			fw = new FileWriter("b_char.txt");
			fw.write("와, IO 정말 재밌다!!");
			fw.write("A");
			fw.write(" ");
			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				fw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

	public void flieOpen() {
		try (FileReader fr = new FileReader("b_char.txt")) {
			int value;
			while ((value = fr.read()) != -1) {
				System.out.print((char) value + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

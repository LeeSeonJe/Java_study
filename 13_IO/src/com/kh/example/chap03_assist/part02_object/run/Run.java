package com.kh.example.chap03_assist.part02_object.run;

import com.kh.example.chap03_assist.part02_object.model.DAO.objectDAO;

public class Run {
	public static void main(String[] args) {
		objectDAO od = new objectDAO();
		od.fileSave();
		od.fileOpen();
	}
}

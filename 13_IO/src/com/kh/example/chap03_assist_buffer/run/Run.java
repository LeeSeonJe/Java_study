package com.kh.example.chap03_assist_buffer.run;

import com.kh.example.chap03_assist_buffer.model.dao.BufferDAO;

public class Run {
	public static void main(String[] args) {
		BufferDAO bd = new BufferDAO();
		bd.output();
		bd.input();
	}
}

package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;

	Parent p = new Parent();
	public Child1() {
	}

	public void setStr(String str) {
		p.dNum = 0.0;
		p.bool = true;
		p.ch = 'A';
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

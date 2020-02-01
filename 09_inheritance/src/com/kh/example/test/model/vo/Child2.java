package com.kh.example.test.model.vo;

public class Child2 extends Parent {
	private String str;

	public Child2() {
		super();
//		super.num = 10;
		super.dNum = 10.2;
		super.bool = false;
		super.ch = 'L';
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}
}

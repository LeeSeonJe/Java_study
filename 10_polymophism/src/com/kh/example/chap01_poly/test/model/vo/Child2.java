package com.kh.example.chap01_poly.test.model.vo;

public class Child2 extends Parent {
	private int n;

	public Child2() {

	}

	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void printChild2() {
		System.out.println("���� ��°��");
	}

	@Override
	public void print() {
		System.out.println("���� �� ���� �ڽ��̾�!!!!!!!!!!!!");
	}
}

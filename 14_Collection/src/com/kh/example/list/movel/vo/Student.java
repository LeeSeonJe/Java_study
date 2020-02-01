package com.kh.example.list.movel.vo;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " (" + score + "��) ";
	}

	@Override
	public int hashCode() {
		final int prime = 31; // ��ǻ�Ͱ� ���������� ������ ũ�鼭 ����ϱ� ���� ����
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode()); // ������ �ڷ���
		result = prime * result + score; // �⺻ �ڷ���
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		// ================= ��ü ��ü�� ��
		if (this == obj) {
			// this�� ������ ������ �� �ڽ��� �ּҰ��� ������ �ִ�. �װͰ� �Ű������� ���� �ּҰ��� ������ ��
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			// getClass �� Ŭ������ ���� ������ ���� �޼ҵ�
			return false;
		}
		// ================= ��ü ��ü�� ��

		// ================= �ʵ带 ��
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		} // ������ �ڷ���

		if (score != other.score) {
			return false;
		} // �⺻ �ڷ���
		return true;
		// ================= �ʵ带 ��
	}

	@Override
	public int compareTo(Student o) {
		String otherName = o.getName();
		return name.compareTo(otherName);
	}

//	@Override
//	public int compareTo(Student o) {
//		// �̸��� ���ؼ� �������� ����
//		// �̸� ==> String
//		// ==> String�� ���� �������� ����
//		String otherName = o.getName();
////			compareTo�� ��ȯ �� : int
////			�� ��ü�� �� ���� ������ 0
////			�� ��ü�� �� ��󺸴� ũ�� 1
////			�� ��ü�� �� ��󺸴� ������ -1 ��ȯ
//		return name.compareTo(otherName);
//	}

}
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
		return name + " (" + score + "점) ";
	}

	@Override
	public int hashCode() {
		final int prime = 31; // 컴퓨터가 인지했을때 적당히 크면서 계산하기 좋은 숫자
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode()); // 참조형 자료형
		result = prime * result + score; // 기본 자료형
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		// ================= 객체 자체를 비교
		if (this == obj) {
			// this는 참조형 변수로 나 자신의 주소값을 가지고 있다. 그것과 매개변수로 들어온 주소값이 같은가 비교
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			// getClass 내 클래스에 대한 정보를 가진 메소드
			return false;
		}
		// ================= 객체 자체를 비교

		// ================= 필드를 비교
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		} // 참조형 자료형

		if (score != other.score) {
			return false;
		} // 기본 자료형
		return true;
		// ================= 필드를 비교
	}

	@Override
	public int compareTo(Student o) {
		String otherName = o.getName();
		return name.compareTo(otherName);
	}

//	@Override
//	public int compareTo(Student o) {
//		// 이름에 대해서 오름차순 정렬
//		// 이름 ==> String
//		// ==> String에 대해 오름차순 정렬
//		String otherName = o.getName();
////			compareTo의 반환 값 : int
////			비교 주체가 비교 대상과 같으면 0
////			비교 주체가 비교 대상보다 크면 1
////			비교 주체가 비교 대상보다 작으면 -1 반환
//		return name.compareTo(otherName);
//	}

}
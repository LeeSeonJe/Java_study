package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog> {
	private String name;
	private double weight;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return name + "(" + weight + "kg)";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) weight;
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		// 객체 비교
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Dog other = (Dog) obj;
		// 필드 비교
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.contentEquals(other.name)) {
			return false;
		}

		if (weight != other.weight) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Dog o) {
		// 이름에 대해서 오름차순
		String other = o.getName();
		return name.compareTo(other);
	}
}

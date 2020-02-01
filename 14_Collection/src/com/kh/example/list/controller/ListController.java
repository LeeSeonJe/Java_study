package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.movel.vo.Student;

public class ListController {
	public void doList() {
		List list1 = new ArrayList(); // ArrayList <E> << ���׸� E�� ������Ʈ

//													�� �迭 ũ�� �ʱⰪ�� 10
		List<Student> list = new ArrayList<Student>(3);
		// add(E e) : ����Ʈ ���� ������ e �߰�
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("�����", 60));

		System.out.println("list : " + list);

		list.add(new Student("������", 90));
		// ������ �迭 ũ�Ⱚ�� �Ѿ�ȴ�.
		// ���� 1. �迭�� ũ�⿡ ������ ����.
		list.add(new Student("����ȣ", 85));
		list.add(new Student("���̹�", 66));

		System.out.println("���� list�� ���� element ���� : " + list.size());
		System.out.println("list : " + list);

		// �÷��� ���� 2. �߰�/����/���� ���� ���ó�� ����
		// add(int index, E e) : index��° �ε����� e �߰�
		list.add(0, new Student("�����", 100));
		list.add(3, new Student("���ǰ�", 40));
		System.out.println("list : " + list);

		// remove(int index) : �ش� index��° ��ü ����
		list.remove(1);

		// remove(Object o) : �ش� Object��ü ����
		// ObjectŬ���� �ȿ��ִ� equals�� hashCode �޼ҵ� �ΰ��� �������̵��ؼ� ������ �ؾ����� ������ ����
		// ������ ��� : �ּҰ��� ���� ���ϴ� ���� �ƴ϶� �ȿ� �� �ִ� �ʵ尪�� ���� �� �ְ� ����
		list.remove(new Student("���ǰ�", 40)); // new �����ڸ� ���ؼ� ��ü�� �������ֱ� ������
//		System.out.println(list.remove(new Student("���ǰ�", 40)));
		System.out.println("list : " + list);

		// ���� ��� 1. Collections Ŭ���� �̿� Collection��
//		Collections.sort(list); //���� ������ ���� ������ �����߻�, ���� ������ ����� ���� Comparable, Comparator ���
//		Comparable = �Ѱ��� ���ĸ� ���� / Comparator = ���� ���� ���� ����
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("����ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("���ð�");
//		strList.add("��ٽð�");
//		strList.add("��ħ�ð�");
//		System.out.println(strList);
//		Collections.sort(strList);
//		System.out.println(strList);

		Collections.sort(list);
		System.out.println("list : " + list);

		// ���� ��� 2. List.sort()�޼ҵ� �̿�
		list.add(new Student("�ں���", 85));
		list.sort(new StudentComparator());
		System.out.println(list);

		// set(int index, E e) : index��° �ε����� �ִ� ��Ҹ� e�� ����
		list.set(2, new Student("�����", 31));
//		System.out.println(list.set(2, new Student("�����", 31)));
		System.out.println("list : " + list);

		// get(int index) : index��° �ε����� �ִ� ��Ҹ� ������ ��
		Student s = list.get(2);
		System.out.println(s);

		// subList(int index, int index2) : index1��° �ε������� index2��° �ε������� ����Ʈ ��ȯ
		System.out.println(list.subList(2, 5));

		// contains(Object o) : o�� ����Ʈ�� �����Ѵٸ� true��ȯ
		// indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, ���ٸ� -1 ��ȯ
		System.out.println(list.contains(new Student("������ ", 90)));
		System.out.println(list.indexOf(new Student("������ ", 90)));
		System.out.println(list.indexOf(new Student("�׽�Ʈ", 0)));

		// clear() : ����� ��� ��ü ����
		// isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
	}
}

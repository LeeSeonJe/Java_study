package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		Set<Dog> set = new HashSet<Dog>();

		set.add(new Dog("����", 4.0)); // ������~
		set.add(new Dog("ȣ��", 4.5));
		set.add(new Dog("����", 8.1));

//		System.out.println(set);
		set.add(new Dog("����", 4.0));
		// new ������ ������ �ּҰ��� �޶� equals�� hashCode �������̵��� ���� ���� ��ü ���� �ߺ��ȵ�
//		System.out.println(set);

		// Set�� List�� �޼ҵ尡 ���� ==> Collection�� ��ӹޱ� ����

//		Set<String> test = new HashSet<String>();
//		test.add("����1");
//		test.add("����2");
//		test.add("����3");
//		System.out.println(test);
//		test.add("����2");
//		System.out.println(test); // String ó�� �ȿ� equals�� hashCode�� �������̵� �Ǿ��־ ���� �ʿ䰡 ����.

		Set<Dog> set2 = new LinkedHashSet<Dog>();

		set2.add(new Dog("����", 2.1));
		set2.add(new Dog("����", 8.3));
		set2.add(new Dog("�κ�", 5.0));
		set2.add(new Dog("����", 2.1));
//		System.out.println(set2); // ������ �����ǰ� �ߺ� ������ �ȵǴ� LinkedHashSet

		set2.add(new Dog("����", 6.1));
		set2.add(new Dog("����", 5.2));
		set2.add(new Dog("����", 9.5));
		set2.add(new Dog("����", 12.5));
//		System.out.println(set2);

		Set<Dog> set3 = new TreeSet<Dog>(set2); // TreeSet�� ������ �Ǹ鼭 ��������µ� ���� ������ ��� ������ ���.
//		Exception in thread "main" java.lang.ClassCastException: com.kh.example.set.model.vo.Dog cannot be cast to java.lang.Comparable
//		System.out.println(set3);

		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		
		set4.add(new Dog("����", 6.1));
		set4.add(new Dog("����", 8.3));
		set4.add(new Dog("�κ�", 5.0));
		set4.add(new Dog("����", 2.1));
		set4.add(new Dog("����", 6.1));
		set4.add(new Dog("����", 5.2));
		set4.add(new Dog("����", 9.5));
		set4.add(new Dog("����", 12.5));
//		System.out.println(set4);

		// ��� �̾Ƴ���
		// ��� 1. Set�� Listȭ ��Ű�� : addAll() �޼ҵ� ���
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));

		// ��� 2. Iterator Ȱ���ϱ� : iterator()
		Iterator<Dog> it = set4.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		while (it.hasNext()) { // ��µ��� �ʴ´� �ܹ��� ��ȸ��
			System.out.println("re : " + it.next());
		}
	}
}

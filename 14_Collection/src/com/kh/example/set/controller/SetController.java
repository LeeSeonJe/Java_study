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

		set.add(new Dog("샤샤", 4.0)); // 샤샤샤~
		set.add(new Dog("호두", 4.5));
		set.add(new Dog("우유", 8.1));

//		System.out.println(set);
		set.add(new Dog("샤샤", 4.0));
		// new 연산자 때문에 주소값이 달라서 equals와 hashCode 오버라이딩을 통해 동등 객체 또한 중복안됨
//		System.out.println(set);

		// Set은 List와 메소드가 동일 ==> Collection을 상속받기 위해

//		Set<String> test = new HashSet<String>();
//		test.add("예시1");
//		test.add("예시2");
//		test.add("예시3");
//		System.out.println(test);
//		test.add("예시2");
//		System.out.println(test); // String 처럼 안에 equals나 hashCode가 오버라이딩 되어있어서 해줄 필요가 없다.

		Set<Dog> set2 = new LinkedHashSet<Dog>();

		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
//		System.out.println(set2); // 순서는 유지되고 중복 저장은 안되는 LinkedHashSet

		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
//		System.out.println(set2);

		Set<Dog> set3 = new TreeSet<Dog>(set2); // TreeSet은 정렬이 되면서 만들어지는데 정렬 기준이 없어서 에러가 뜬다.
//		Exception in thread "main" java.lang.ClassCastException: com.kh.example.set.model.vo.Dog cannot be cast to java.lang.Comparable
//		System.out.println(set3);

		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		
		set4.add(new Dog("초코", 6.1));
		set4.add(new Dog("콩이", 8.3));
		set4.add(new Dog("두부", 5.0));
		set4.add(new Dog("초코", 2.1));
		set4.add(new Dog("로이", 6.1));
		set4.add(new Dog("공주", 5.2));
		set4.add(new Dog("왕자", 9.5));
		set4.add(new Dog("조이", 12.5));
//		System.out.println(set4);

		// 요소 뽑아내기
		// 방법 1. Set을 List화 시키기 : addAll() 메소드 사용
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));

		// 방법 2. Iterator 활용하기 : iterator()
		Iterator<Dog> it = set4.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		while (it.hasNext()) { // 출력되지 않는다 단방향 일회성
			System.out.println("re : " + it.next());
		}
	}
}

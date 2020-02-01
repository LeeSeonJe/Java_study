package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.movel.vo.Student;

public class ListController {
	public void doList() {
		List list1 = new ArrayList(); // ArrayList <E> << 제네릭 E는 오브젝트

//													↓ 배열 크기 초기값은 10
		List<Student> list = new ArrayList<Student>(3);
		// add(E e) : 리스트 끝에 데이터 e 추가
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));

		System.out.println("list : " + list);

		list.add(new Student("남나눔", 90));
		// 지정한 배열 크기값을 넘어도된다.
		// 장점 1. 배열의 크기에 제약이 없다.
		list.add(new Student("하현호", 85));
		list.add(new Student("문미미", 66));

		System.out.println("현재 list에 담진 element 개수 : " + list.size());
		System.out.println("list : " + list);

		// 컬렉션 장점 2. 추가/삭제/정렬 등의 기능처리 간단
		// add(int index, E e) : index번째 인덱스에 e 추가
		list.add(0, new Student("류라라", 100));
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);

		// remove(int index) : 해당 index번째 객체 삭제
		list.remove(1);

		// remove(Object o) : 해당 Object객체 삭제
		// Object클래스 안에있는 equals와 hashCode 메소드 두개를 오버라이딩해서 재정의 해야지만 삭제가 가능
		// 재정의 방법 : 주소값을 서로 비교하는 것이 아니라 안에 들어가 있는 필드값을 비교할 수 있게 만듬
		list.remove(new Student("강건강", 40)); // new 연산자를 통해서 객체를 생성해주기 때문에
//		System.out.println(list.remove(new Student("강건강", 40)));
		System.out.println("list : " + list);

		// 정렬 방법 1. Collections 클래스 이용 Collection에
//		Collections.sort(list); //정렬 기준이 없기 때문에 에러발생, 정렬 기준을 새우기 위한 Comparable, Comparator 사용
//		Comparable = 한개의 정렬만 가능 / Comparator = 여러 개의 정렬 가능
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("저녁시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
//		System.out.println(strList);
//		Collections.sort(strList);
//		System.out.println(strList);

		Collections.sort(list);
		System.out.println("list : " + list);

		// 정렬 방법 2. List.sort()메소드 이용
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator());
		System.out.println(list);

		// set(int index, E e) : index번째 인덱스에 있는 요소를 e로 수정
		list.set(2, new Student("도대담", 31));
//		System.out.println(list.set(2, new Student("도대담", 31)));
		System.out.println("list : " + list);

		// get(int index) : index번째 인덱스에 있는 요소를 가지고 옴
		Student s = list.get(2);
		System.out.println(s);

		// subList(int index, int index2) : index1번째 인덱스부터 index2번째 인덱스까지 리스트 반환
		System.out.println(list.subList(2, 5));

		// contains(Object o) : o가 리스트에 존재한다면 true반환
		// indexOf(Object o) : o가 리스트에 위치하는 인덱스 번호 반환, 없다면 -1 반환
		System.out.println(list.contains(new Student("남나눔 ", 90)));
		System.out.println(list.indexOf(new Student("남나눔 ", 90)));
		System.out.println(list.indexOf(new Student("테스트", 0)));

		// clear() : 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비었을 때 true 반환
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
	}
}

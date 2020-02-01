package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd : String
	// - userName : String
	// - enrollDate : Date(java.util)

	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;

//	생성자 사용 목적(객체가 하는 일)
//		1. 객체를 생성해주기 위한 목적
//		2. 매개 변수로 전달 받은 값으로 필드 초기화

//	생성자 사용 규칙
//		1. 생성자 명은 클래스 명과 동일해야 함
//		2. 반환(리턴)형이 없다
	public /* 반환형이 없다 */ User() {
		// 기본 생성자 : 매개 변수가 없는 생성자
		// JVM이 기본적으로 생성
		// 매개변수 있는 생성자를 만들면 JVM이 자동으로 기본 생성자를 생성해주지 않기 때문에 반드시 명시해야함
	}

	/* public User() {} */
	// Duplicate method User() in type User
	// 같은 이름의 생성자(메소드)가 있을 때 오버로딩이 적용되지 않으면 에러 발생

	public User(String userId, String userPwd) {
		// this 안에 생성된 객체의 주소 값이 담기게 된다.
		this.userId = userId;
		this.userPwd = userPwd;
	}

	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd);
		this.userName = userName;
	}

//	타임의 개수와 순서가 같고 매개변수 명이 다르다고 해도 오버로딩이 되지않음
//	public User(String id, String name) {
//		userId = id;
//		userName = name;
//	}

	public User(String userId, String userPwd, String userName, Date enrollDate) {
		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}

	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
}

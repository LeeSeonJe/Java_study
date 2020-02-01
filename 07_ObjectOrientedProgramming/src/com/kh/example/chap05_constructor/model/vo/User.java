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

//	������ ��� ����(��ü�� �ϴ� ��)
//		1. ��ü�� �������ֱ� ���� ����
//		2. �Ű� ������ ���� ���� ������ �ʵ� �ʱ�ȭ

//	������ ��� ��Ģ
//		1. ������ ���� Ŭ���� ��� �����ؾ� ��
//		2. ��ȯ(����)���� ����
	public /* ��ȯ���� ���� */ User() {
		// �⺻ ������ : �Ű� ������ ���� ������
		// JVM�� �⺻������ ����
		// �Ű����� �ִ� �����ڸ� ����� JVM�� �ڵ����� �⺻ �����ڸ� ���������� �ʱ� ������ �ݵ�� ����ؾ���
	}

	/* public User() {} */
	// Duplicate method User() in type User
	// ���� �̸��� ������(�޼ҵ�)�� ���� �� �����ε��� ������� ������ ���� �߻�

	public User(String userId, String userPwd) {
		// this �ȿ� ������ ��ü�� �ּ� ���� ���� �ȴ�.
		this.userId = userId;
		this.userPwd = userPwd;
	}

	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd);
		this.userName = userName;
	}

//	Ÿ���� ������ ������ ���� �Ű����� ���� �ٸ��ٰ� �ص� �����ε��� ��������
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

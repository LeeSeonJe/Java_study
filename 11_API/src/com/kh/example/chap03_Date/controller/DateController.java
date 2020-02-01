package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {

	public void method1() {
		Date today = new Date();
		System.out.println(today); // 현재시간

		// 1970년 1월 1일 0시 0분 0초 이후로 흐른 시간을 가져올 때
		System.out.println(today.getTime());

		Date time = new Date(1578917291827L);
		System.out.println(time);

		Date origin = new Date(0);
		System.out.println(origin);

		Date date = new Date(200, 1, 13);
	}

	public void method2() {
		// 추상클래스라서 객체생성불가 Calendar.getInstance()를 통해 생성
		Calendar c = Calendar.getInstance();
		c.set(2020, 0, 22);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date time = c.getTime();
		String test = sdf.format(time);
		System.out.println(test);

		int year = c.get(Calendar.YEAR);
//		System.out.println(year);

		int month = c.get(Calendar.MONTH) + 1;
//		System.out.println(month);

		int date = c.get(Calendar.DATE);
//		System.out.println(date);

		int amPm = c.get(Calendar.AM_PM);
//		System.out.println(amPm);

		int hour = c.get(Calendar.HOUR);
//		System.out.println(hour);
//		hour = c.get(Calendar.HOUR_OF_DAY); // 24시간 표현
//		System.out.println(hour);

		int min = c.get(Calendar.MINUTE);
//		System.out.println(min);

		int sec = c.get(Calendar.SECOND);
//		System.out.println(sec);
	}

	public void method3() {
		// GregorianCalendar는 특정 날짜 값을 입력해서 객체 생성하는 기능 제공
		// 2020.6.17
		int year = 2020;
		int month = 5;
		int date = 17;
		int hour = 22;
		int min = 0;
		int sec = 0;

		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		long time = gc.getTimeInMillis();
		Date endDay = new Date(time);
		System.out.println(endDay);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH) + 1);
		System.out.println(gc.get(Calendar.DATE));

		// 2020-06-17 수요일 오후 22시 00분 00초

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH시 mm분 ss초");
		String fmf = sdf.format(endDay);
		System.out.println(fmf);
	}
}

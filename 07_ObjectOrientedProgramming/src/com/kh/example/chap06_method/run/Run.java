package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTset;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodTset mt = new MethodTset();
		mt.method1();
		int a = mt.method2();
		System.out.println(a);
		mt.method3(10, 20);
		System.out.println(mt.method4(10, 30));

		int[] resultArr = mt.method5();
		System.out.println("Run resultArr   : " + resultArr);

		User resultUser = mt.method6();
		System.out.println("Run resultUser  : " + resultUser);

		Trainee tt = new Trainee("¹Ú½Å¿ì");
		System.out.println(tt.inform());

		Trainee.setScore(20);
		System.out.println(tt.inform());
		double score = Trainee.getScore();
		System.out.println(score);
		tt.setClassRoom('G');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());
	}
}

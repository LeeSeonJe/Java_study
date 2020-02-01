package com.kh.example.chap02_class.defaultClass.run;

/*default*/ public class Run {

	public static void main(String[] args) {
		/* DefaultClassTest dct = new DefaultClassTest(); */
		// DefaultClassTest cannot be resolved to a type
		// DefaultClassTest를 타입으로 만들 수 없습니다.
		// default 클래스는 다른(외부) 패키지에서 접근이 불가능하기 때문에 없는 클래스라는 에러발생
		// 하지만 같은(내부) 패키지 내에서는 사용 가능
	}

}

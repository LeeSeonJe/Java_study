package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
//							   ------------------------ ==> Marker Interface 선언만 되어있고 안에는 아무것도 없는 것
//															이 인터페이스를 구현한 클래스는 어떠한 특성을 가지고 있는걸 알려주기 위한 목적으로 사용 
	public abstract void eat();

	public abstract void sleep();
}

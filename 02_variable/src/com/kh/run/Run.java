package com.kh.run;

import com.kh.variable.A_Variable; // ´ÜÃàÅ° ctrl + shift + o
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_Keyboardinput;

public class Run {
	public static void main(String[] args) {
		A_Variable av = new A_Variable();
//		av.declareVeariable();
//		av.initVariable();

		B_Constant bc = new B_Constant();
//		bc.finalConstant();
		
		C_Overflow co = new C_Overflow();
//		co.overflow();
//		co.calc();
		
		D_Cast dc = new D_Cast();
//		dc.rule1();
//		dc.rule2();
//		dc.rule3();
		
		E_PrintMethod ep = new E_PrintMethod();
//		ep.printExample();
//		ep.printlnExample();
//		ep.printfExample();
		
		F_Keyboardinput fk = new F_Keyboardinput();
//		fk.inputScanner();
		fk.inputScanner2();
		
		
//		String str = "±âÂ÷" + 123 + 45 + "Ä¢Ä¢ÆøÆø";
//		String str1 = 123 + 45 + "±âÂ÷" + "Ä¢Ä¢ÆøÆø";
//		
//		System.out.println(str);
//		System.out.println();
//		System.out.println(str1);

		
	}
}
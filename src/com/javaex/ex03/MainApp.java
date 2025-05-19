package com.javaex.ex03;

public class MainApp {
	
	public static void main(String[] args) {
		
		//숫자 출장 보내서 일시키기
		DigitThread dt = new DigitThread();
		dt.start();
		
		//소문자 출장 보내서 일시키기
		LowerThread lt = new LowerThread();
		lt.start();
		
		//대문자 출장 보내서 일시키기
		UpperThread ut = new UpperThread();
		ut.start();
		
		//3개 동시에 출력되어야 한다
		
		
		
	}
	
}

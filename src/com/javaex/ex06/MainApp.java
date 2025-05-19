package com.javaex.ex06;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable dt = new DigitThread();
		Runnable ut = new LowerThread();
		Runnable lt = new UpperThread();
		
		
		//숫자출력
		Thread t01 = new Thread(dt);
		
		//대문자출력
		Thread t02 = new Thread(ut);
		
		//소문자출력
		Thread t03 = new Thread(lt);
		
		t01.start();
		t02.start();
		t03.start();
		
	}

}

package com.javaex.ex05;

public class DigitImpl implements Runnable{ //이미 상속받을게 있어서 상속을 Thread를 상속 받을 수 없을때

	@Override
	public void run() {
		
		for(int i=0; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}

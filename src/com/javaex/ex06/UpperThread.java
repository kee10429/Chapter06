package com.javaex.ex06;

public class UpperThread implements Runnable {
	
	public void run() {
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

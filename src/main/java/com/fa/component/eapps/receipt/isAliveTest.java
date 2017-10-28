/*package com.fa.component.eapps.receipt;

public class isAliveTest extends Thread {
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			printMsg();
		}
	}
	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name=" + name);
	}


	public static void main(String[] args) {
		
		isAliveTest istest=new isAliveTest();
        
		System.out.println("Before Starting Start Method"+istest.isAlive());
		
		istest.start();
		
		System.out.println("After Starting Start Method"+istest.isAlive());
		
		for (int i = 0; i < 3; i++) {
			istest.printMsg();
		}
         
		System.out.println("The end of the main method===" + istest.isAlive());
		
	}

}
*/
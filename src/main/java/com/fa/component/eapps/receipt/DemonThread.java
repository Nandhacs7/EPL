/*package com.fa.component.eapps.receipt;

public class DemonThread extends Thread{
	
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("i.e demon thread");
	     }
        else{
			System.out.println("i.e user thread");
		  }
	}

	public static void main(String[] args) {     
		DemonThread dt1=new DemonThread();
		DemonThread dt2=new DemonThread();
		DemonThread dt3=new DemonThread();
		dt1.setDaemon(true);
		dt1.start();
		dt2.start();
		dt3.start();
	}
}
*/
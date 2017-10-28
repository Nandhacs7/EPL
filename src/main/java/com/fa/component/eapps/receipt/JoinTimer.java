/*package com.fa.component.eapps.receipt;

public class JoinTimer extends Thread  {
	public void run() {
		for (int j = 1; j <= 2; j++) {
			//				Thread.sleep(500);
			System.out.println(Thread.currentThread().getName());
			System.out.println(j);
		}
	}

	public static void main(String[] args) {	
		
		JoinTimer je1 = new JoinTimer();
		je1.setName("thread1");
		je1.start();
		JoinTimer je2 = new JoinTimer();
		je2.setName("thread2");
		je2.start();
		try {
			je1.join(500);
		} catch (Exception e) {
		}
		JoinTimer je3 = new JoinTimer();
		je3.setName("thread3");
		je3.start();

	}

}
*/
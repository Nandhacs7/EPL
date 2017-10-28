/*package com.fa.component.eapps.receipt;

import java.util.concurrent.TimeUnit;

public class Consumer1 extends Thread {

	Producer1 prod;
	Consumer1(Producer1 prod) {
		this.prod = prod;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
	      System.out.println("received "+ prod.bq.poll(10, TimeUnit.SECONDS));
			} catch (InterruptedException e) {

			}
		}
	}

	
	
	
	
}
*/
/*package com.fa.component.eapps.receipt;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer1 extends Thread {
	
	BlockingQueue<String> bq;
	Producer1() {
		bq = new ArrayBlockingQueue<String>(5);
	}
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("adding str" + i);
				bq.put("str" + i);
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
	}


}
*/
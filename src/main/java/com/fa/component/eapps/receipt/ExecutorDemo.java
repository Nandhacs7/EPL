/*package com.fa.component.eapps.receipt;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo {
  public void execDemo(int nThreads) {
	final Executor exec = Executors.newFixedThreadPool(nThreads);
	for (int i = 0; i < 5; i++) {
	 Runnable task = new Runnable() {
	@Override
	public void run() {
		 try {
           System.out.println("Started"+Thread.currentThread() +"at"+ new Date());
           Thread.sleep(5000);
            System.out.println("Exiting"+Thread.currentThread() +"at"+new Date());
            } catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			exec.execute(task);
		}
	}
	public static void main(String[] args) {

		ExecutorDemo eD = new ExecutorDemo();

		eD.execDemo(2);
	}
 

}
*/
/*package com.fa.component.eapps.receipt;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo2 {
	
	private void exut(int nThreads) {
		final Executor exec = Executors.newFixedThreadPool(nThreads);
		
		Runnable task=new Runnable(){
			@Override
			public void run() {				
				try {
					System.out.println("Current"+Thread.currentThread()+"at"+new Date());
					Thread.sleep(500);
					System.out.println("Existing"+Thread.currentThread()+"at"+new Date());
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
   };exec.execute(task);
   
   
}

	public static void main(String[] args) {
		
		ExecutorDemo2 exe= new ExecutorDemo2();
        
		exe.exut(2);
	}
}
*/
/*package com.fa.component.eapps.receipt;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ImplementConcurrentCallable1 implements Callable<String> {
	private static final int THREAD_POOL_SIZE=2;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor=Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		
		Future<String> future1=executor.submit(new ImplementConcurrentCallable1());
		
		Future<String> future2=executor.submit(new ImplementConcurrentCallable1());

		System.out.println(Thread.currentThread().getName()+"Executing......");
		
		System.out.println(future1.get());
		System.out.println(future2.get());
		
		
	}

	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName()+"Executing......";
	}

}
*/
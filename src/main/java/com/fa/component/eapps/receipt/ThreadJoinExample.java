/*package com.fa.component.eapps.receipt;

public class ThreadJoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        
        t1.start();
        t2.start();
        
        //start second thread after waiting for 2 seconds or if it's dead
        try {
        	t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t3.start();
        
        //start third thread only when first thread is dead
          try {
        	t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
  
        
        //let all threads finish execution before finishing main thread

        
        System.out.println("All threads are dead, exiting main thread");
    }

}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
    
}
*/
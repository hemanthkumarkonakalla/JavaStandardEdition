package com.java.standard.edition.multithreading;

public class RunnableLambdaDemo 
{
	public static void main(String[] args) 
	{
		Runnable r1=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Hii");
				System.out.println(Thread.currentThread().getName()+" >>>>> "+Thread.currentThread().threadId());
			}
		};
		
		Runnable r2=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Hello");
				System.out.println(Thread.currentThread().getName()+" >>>>> "+Thread.currentThread().threadId());
			}
		};
		
		Thread t1 = new Thread(r1,"ThreadOne");
		System.out.println(t1.getState());
		
		Thread t2 = new Thread(r2,"ThreadTwo");
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Active Threads Count:"+Thread.activeCount());
		System.out.println(t1.getState());

		
	}

}

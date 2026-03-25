package com.java.standard.edition.multithreading;

public class ThreadOne extends Thread
{
	public static void main(String[] args) 
	{
		ThreadOne t1 = new ThreadOne();
		ThreadOne t2 = new ThreadOne();
		ThreadOne t3 = new ThreadOne();
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Active Threads Count:"+Thread.activeCount());
		
	}

}

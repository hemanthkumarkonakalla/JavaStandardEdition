package com.java.standard.edition.deadlock;

public class T1 extends Thread
{
	T2 t2;
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				t2.join(); //T1 thread will wait until t2 thread completes its execution
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("From Thread T1");
		}
	}

}

package com.java.standard.edition.deadlock;

public class T2 extends Thread
{
	T1 t1;
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				t1.join(); // T2 thread will wait until T1 Thread completes its execution
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("From Thread T2");
		}
	}

}

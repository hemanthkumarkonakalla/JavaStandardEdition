package com.java.standard.edition.volatilekeyword;

public class VolatileDemo implements Runnable
{

	private static volatile boolean value;
	
	@Override
	public void run() 
	{
		int i=0;
		while(!value)
		{
			i++;
		}
		
		System.out.println("Thread is completed");
		
	}
	
	
	public static void main(String[] args) 
	{
		VolatileDemo vd = new VolatileDemo();
		Thread t1 = new Thread(vd);
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		value=true;
		
		System.out.println("Main Completed");
		
	}

}

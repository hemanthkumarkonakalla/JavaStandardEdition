package com.java.standard.edition.synchronizeddemo;

public class BrickCounter
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrickDairy bd = new BrickDairy();
		Runnable r1 = ()->
		{
			for(int i=0;i<10000;i+=50)
			{
				bd.brickIncrementer();
			}
		};
		
		Runnable r2 = ()->
		{
			for(int i=0;i<15000;i+=50)
			{
				bd.brickIncrementer();
			}
		};
		
		Runnable r3 = ()->
		{
			for(int i=0;i<5000;i+=50)
			{
				bd.brickIncrementer();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Bricks Count in Load 1 is :"+bd.bricksCount);
		System.out.println("Bricks Count in Load 2 is :"+bd.bricksCount1);

		
		
	}

}

class BrickDairy
{
	int bricksCount=0;
	int bricksCount1=0;
	
	public /*synchronized*/ void brickIncrementer()
	{
		bricksCount+=50;
		
		synchronized(this) 
		{
			bricksCount1+=50;
		}
	}
}

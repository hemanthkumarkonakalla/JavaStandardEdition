package com.java.standard.edition.waitnotify;

public class WaitNotify 
{
	public static void main(String[] args) throws InterruptedException {
		
		ThreadOne t1 = new ThreadOne();
		t1.start();
		synchronized (t1) 
		{
			t1.wait();
		}
		System.out.println(t1.count);
	}

}


class ThreadOne extends Thread
{
	int count=0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<100;i++)
			{
				count++;
			}
			
			this.notify();
		}
		
	}
}
package com.java.standard.edition.multithreading;

public class MultiThreadingOne
{
	public static void main(String[] args) 
	{
		System.out.println("Default Thread Name is :"+Thread.currentThread().getName());
		System.out.println("Default Thread Id is :"+Thread.currentThread().threadId());
		System.out.println("Thread Priority is :"+Thread.currentThread().getPriority());
		System.out.println("Active Threads Count is :"+Thread.activeCount());
	
		
	}

}

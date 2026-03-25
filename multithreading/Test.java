package com.java.standard.edition.multithreading;

public class Test 
{
	public static void main(String[] args) 
	{
		//Extends Thread Class
		
//		Employee e1 = new Employee("Employee");
//		Manager m1 = new Manager("Manager");
//		e1.start();
//		m1.start();
//		
//		System.out.println("Threads Active Count:"+Thread.activeCount());
		
		
		
		//Implements Runnable Interface
		
		EmployeeOne e1 = new EmployeeOne();
		ManagerOne m1 = new ManagerOne();
		Thread t1 = new Thread(e1,"Employee");
		Thread t2 = new Thread(m1,"Manager");
		t1.start();
		t2.start();
		
	}

}

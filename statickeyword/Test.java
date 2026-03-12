package com.java.standard.edition.statickeyword;

public class Test 
{
	public static void main(String[] args) //static method
	{
		
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		
		b1.takeInput();
		b1.calculate();
		System.out.println("===============================================");
		b2.takeInput();
		b2.calculate();
		System.out.println("================================================");
		b3.takeInput();
		b3.calculate();
	}

}

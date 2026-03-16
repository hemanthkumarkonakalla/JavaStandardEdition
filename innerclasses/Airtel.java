package com.java.standard.edition.innerclasses;

public class Airtel 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Trai t = new Trai()
				{	
					@Override
					public void call()
					{
						System.out.println("This is call method provides call functionality");
					}
			
				};
				
				
				t.call();
		
	}

}

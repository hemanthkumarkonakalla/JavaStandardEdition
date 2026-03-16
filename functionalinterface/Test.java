package com.java.standard.edition.functionalinterface;

public class Test 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee()
				{
					@Override
					public void display()
					{
						System.out.println("this is display method from employee interface");
					}
				};
				
				e.display();
		
	}

}

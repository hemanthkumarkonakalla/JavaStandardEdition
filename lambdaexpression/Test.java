package com.java.standard.edition.lambdaexpression;

public class Test 
{
	public static void main(String[] args) 
	{
		Car c = (speed,Model)->
		{
			if(speed<50)
			{
				System.out.println("Car is running smoothly with "+speed+" kmph");
				System.out.println("Car model is :"+Model);

				return 1;

			}
			else
			{
				System.out.println("Car is running smoothly with "+speed+" kmph");
				System.out.println("Car model is :"+Model);
				return 2;
			}
		};

		
		int res=c.driver(50,"Tata Sierra");
		System.out.println(res);
		
	}

}

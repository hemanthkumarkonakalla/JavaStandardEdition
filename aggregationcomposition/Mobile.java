package com.java.standard.edition.aggregationcomposition;

public class Mobile 
{
	Os os = new Os("Android","64Bit");
	
	public void charger(Charger ref)
	{
		System.out.println(ref.getColor());
		System.out.println(ref.getCost());
	}
	
	public static void main(String[] args) 
	{
		Mobile m = new Mobile();
		System.out.println(m.os.getName());//Android
		System.out.println(m.os.getType());//64 bit
		Charger c = new Charger("Black",1500);
		m.charger(c);//black 1500
		
		m=null;
		try
		{
			System.out.println(m.os.getName());
			System.out.println(m.os.getType());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(c.getColor()+" "+c.getCost());
		
		
	}

}

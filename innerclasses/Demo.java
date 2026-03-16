package com.java.standard.edition.innerclasses;

import com.java.standard.edition.innerclasses.Outer.Inner4;

public class Demo 
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Inner4 i4 = o.new Inner4();
		i4.display1();
		i4.testing();
		
	}

}

package com.java.standard.edition.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String res=sdf.format(d);
		System.out.println(res);
		
	}

}

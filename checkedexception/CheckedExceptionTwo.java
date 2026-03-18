package com.java.standard.edition.checkedexception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionTwo 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded sucessfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con =null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/completejdbc", "root", "root");
			System.out.println("Connection established sucessfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally
		{
			if(con!=null)
			{
				try {
					con.close();
					System.out.println("Connection closed sucessfully");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("This is the last line of code");
		
	}

}

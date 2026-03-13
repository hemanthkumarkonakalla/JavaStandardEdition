package com.java.standard.edition.serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Employee e = new Employee("HemanthKumarKonakalla", 15, "Software", 85000);
		FileOutputStream fos = new FileOutputStream("./data.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(e);
		os.close();
		fos.close();
		System.out.println("Data Serialized Sucessfully");
		
		FileInputStream fis = new FileInputStream("./data.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e1=(Employee)ois.readObject();
		System.out.println("Data de-serialized sucessfully");
		System.out.println("Name:"+e1.getName());
		System.out.println("Id:"+e1.getId());
		System.out.println("Salary:"+e1.getSalary());
		System.out.println("Dept:"+e1.getDept());
		
		fis.close();
		ois.close();
		
	}

}

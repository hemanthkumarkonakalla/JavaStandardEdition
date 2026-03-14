package com.java.standard.edition.interfaces;

public class Jio implements Trai{

	@Override
	public void call() {
		System.out.println("Jio charges 2 paise per one second");
	}

	@Override
	public void message() {
		System.out.println("Jio offers 100 sms perday");
	}

	@Override
	public void data() {
		System.out.println("Jio offers 1.5  per day for 28days");

	}

	@Override
	public void recharge() {
		System.out.println("Jio basic recharge plan starts from 299 rupees");

	}
	
	public void jioTV()
	{
		System.out.println("This is the app provided by jio to watch the TV");
	}

	@Override
	public void spectrum() {
		System.out.println("Jio purchases 5g spectrum from government");
	}

}

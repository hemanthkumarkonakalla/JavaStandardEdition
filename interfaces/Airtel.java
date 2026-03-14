package com.java.standard.edition.interfaces;

public class Airtel extends Test1 implements Trai {

	@Override
	public void call() 
	{
		System.out.println("Airtel charges 1paise per one second");
		
	}

	@Override
	public void message() {
		System.out.println("Airtel offers 100 sms perday");
	}

	@Override
	public void data() {
		System.out.println("Airtel offers 2gb for 28 days");
	}

	@Override
	public void recharge() {
		System.out.println("Airtel basic recharge plan starts from 199 rupees");
	}
	
	public void xStream()
	{
		System.out.println("This is the app provided by airtel to stream ott's");
	}

	@Override
	public void spectrum() {
		System.out.println("Airtel purchases 5g spectrum from government");
	}

}

package com.designpattern.facade;

public class OrderProcessor {

	public boolean checkStock(String itmName)
	{
		System.out.println("Checking stock");
		return true;
	}
	
	public void placeOrder(String name, int quantity)
	{
		System.out.println("Order placed");
	}
	
	public void shipOrder(String orderId)
	{
		System.out.println("Order shipped");
	}
}

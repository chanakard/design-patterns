package com.designpattern.facade;

public class OrderFacade {

	public void processOrder(String name, int quantioty, String orderId)
	{
		OrderProcessor orPro =  new OrderProcessor();
		if(orPro.checkStock(name))
		{
			orPro.placeOrder(name, quantioty);
			orPro.shipOrder(orderId);
		}
	}
}

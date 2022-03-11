package com.designpattern.adaptor.assignment;

public class PaymentAdaptor {

	public void pay(int rupees)
	{
		int dollars = rupees * 260;
		
		PaymentProcessor pp = new PaymentProcessorImpl();
		pp.pay(dollars);
	}
}

package com.designpattern.adaptor.assignment;

public class PaymentApp {
	
	public static void main(String[] args) {
		PaymentApp paa = new PaymentApp();
		paa.pay(123);
	}

	public void pay(int rupees)
	{
		PaymentAdaptor pa = new PaymentAdaptor();
		pa.pay(rupees);
	}
}

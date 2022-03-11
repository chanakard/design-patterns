package com.designpattern.adaptor.assignment;

public class PaymentProcessorImpl implements PaymentProcessor {

	public void pay(int dollar) {
		System.out.println("payment done "+dollar +" dollars");
	}

}

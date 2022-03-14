package com.designpattern.proxy;

public class TestProxy {

	public static void main(String[] args) {

		Customer customer = new CustomerProxyImpl();
		System.out.println(customer.getId());
		System.out.println(customer.getOrders());
		
		
	}

}

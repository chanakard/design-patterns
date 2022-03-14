package com.designpattern.facade;

public class TestFacade {

	public static void main(String[] args) {

		OrderFacade of = new OrderFacade();
		of.processOrder("laptop", 3, "123");
		
	}

}

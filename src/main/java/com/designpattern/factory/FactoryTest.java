package com.designpattern.factory;

public class FactoryTest {

	public static void main(String[] args) 
	{
		PizzaStore ps = new PizzaStore();
		Pizza p = ps.orderPizza("chicken");
	}

}

package com.designpattern.decorator;

public class VeggePizzaDecorator extends PizzaDecorator {

	public VeggePizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void bake()
	{
		super.bake();
		System.out.print("Adding vegge toppings");
	}

}

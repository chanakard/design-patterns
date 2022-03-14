package com.designpattern.decorator;

public class PizzaDecorator implements Pizza {

	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public void bake() {
		this.pizza.bake();
	}

}

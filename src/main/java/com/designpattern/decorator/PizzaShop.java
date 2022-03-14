package com.designpattern.decorator;

public class PizzaShop {

	public static void main(String[] args) {
		Pizza pizza = new CheesePizzaDecorator(new PlainPizza());
		pizza.bake();
		System.out.println("/n");
		Pizza pizza1 = new VeggePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza1.bake();
	}

}

package com.designpattern.factory;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza order = PizzaFactory.createPizza(type);

		order.prepare();
		order.bake();
		order.cut();

		return order;
	}

}

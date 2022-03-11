package com.designpattern.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type)
	{
		Pizza order = null;
		if(type.equals("cheese"))
		{
			order =  new PlainCheesePizza();
		}
		else if(type.equals("chicken"))
		{
			order =  new ChickenPizza();
		}
		else if(type.equals("vegge"))
		{
			order =  new cVeggePizza();
		}
		
		return order;
	}
}

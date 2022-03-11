package com.designpattern.factory;

public class ChickenPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing chicken pizza");
		
	}

	public void bake() {
		System.out.println("Baking chicken pizza");
		
	}

	public void cut() {
		System.out.println("Cutting chicken pizza");
		
	}

}

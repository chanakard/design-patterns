package com.designpattern.factory;

public class cVeggePizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing vegge pizza");
		
	}

	public void bake() {
		System.out.println("Baking vegge pizza");
		
	}

	public void cut() {
		System.out.println("Cutting vegge pizza");
		
	}

}

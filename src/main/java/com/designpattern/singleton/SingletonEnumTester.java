package com.designpattern.singleton;

public class SingletonEnumTester {

	public static void main(String[] args) {

		SingletonEnum sin = SingletonEnum.INSTANCE;
		
		System.out.println(sin.getName());
		
		sin.setName("chanaka");
		
		System.out.println(sin.getName());
	}

}

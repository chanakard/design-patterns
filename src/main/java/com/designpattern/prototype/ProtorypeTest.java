package com.designpattern.prototype;

public class ProtorypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Game gane1 = new Game();
		gane1.setId(1);
		gane1.setName("IGI");
		gane1.setMembership(new Membership());
		
		Game game2 = gane1.clone();
		
		System.out.println(gane1);
		System.out.println(game2);
		
		Game game3 = new Game(game2);
		System.out.println(game3);
	}

}

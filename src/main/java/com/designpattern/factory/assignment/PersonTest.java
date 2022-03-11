package com.designpattern.factory.assignment;

public class PersonTest {

	public static void main(String[] args) {
		Person p = PersonFactory.CreatePerson("female");
		p.wish();
	}

}

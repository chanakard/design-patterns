package com.designpattern.factory.assignment;

public class PersonFactory {

	public static Person CreatePerson(String type)
	{
		Person p = null;
		
		if(type.equals("male"))
		{
			p = new PersonMale();
		}
		else if(type.equals("female"))
		{
			p = new PersonFemale();
		}
		
		return p;
		
	}
}

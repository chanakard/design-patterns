package com.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		DateUtill instance1 = DateUtill.getInstance();
		
		DateUtill instance2 = null;
		
		Constructor[] constructors =  DateUtill.class.getDeclaredConstructors();
		
		for(Constructor con : constructors)
		{
			con.setAccessible(true);
			instance2 = (DateUtill) con.newInstance();
			break;
		}
		
		System.out.println(instance1 == instance2);
	}

}

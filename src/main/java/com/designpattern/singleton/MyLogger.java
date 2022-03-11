package com.designpattern.singleton;

import java.io.Serializable;

public class MyLogger implements Serializable{

	private static volatile MyLogger instance;

	private MyLogger() {

	}

	public static MyLogger getInstance() {

		if (instance == null) {
			synchronized (MyLogger.class) {
				instance = new MyLogger();
			}
		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public Object readResolve() {
		return instance;
	}
	
	public void log(String message)
	{
		System.out.println(message);
	}
}

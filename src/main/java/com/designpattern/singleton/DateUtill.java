package com.designpattern.singleton;

import java.io.Serializable;

public class DateUtill implements Serializable{

	private static final long serialVersionUID = 1L;
	private static volatile DateUtill instance;

	private DateUtill() {

	}

	public static DateUtill getInstance() {

		if (instance == null) {
			synchronized (DateUtill.class) {
				instance = new DateUtill();
			}
		}

		return instance;
	}
	
	public Object readResolve()
	{
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is prohibited");
	}
}

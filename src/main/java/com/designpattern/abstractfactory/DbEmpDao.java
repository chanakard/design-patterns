package com.designpattern.abstractfactory;

public class DbEmpDao implements Dao {

	public void save() {
		System.out.println("inside saving Employee to DB");
	}

}

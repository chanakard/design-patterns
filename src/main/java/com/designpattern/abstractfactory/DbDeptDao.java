package com.designpattern.abstractfactory;

public class DbDeptDao implements Dao {

	public void save() {
		System.out.println("inside saving Department to DB");
	}

}

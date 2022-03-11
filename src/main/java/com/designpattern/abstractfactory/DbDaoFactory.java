package com.designpattern.abstractfactory;

public class DbDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		if (type.equals("emp")) {
			return new DbEmpDao();
		} else if (type.equals("dept")) {
			return new DbDeptDao();
		}
		return null;
	}

}

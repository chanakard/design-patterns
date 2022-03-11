package com.designpattern.abstractfactory;

public class XmlDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {

		if (type.equals("emp")) {
			return new XmlEmpDao();
		} else if (type.equals("dept")) {
			return new XmlDeptDao();
		}
		return null;
	}

}

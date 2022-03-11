package com.designpattern.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DaoAbstractFactory daf = DataFactoryProducer.produce("xml");
		Dao dao = daf.createDao("dept");
		dao.save();
	}
}

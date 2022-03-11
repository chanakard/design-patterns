package com.designpattern.abstractfactory;

public class DataFactoryProducer {

	public static void main(String[] args) {
		
	}
	
	public static DaoAbstractFactory produce(String factoryType)
	{
		DaoAbstractFactory obj = null;
		
		if(factoryType.equals("xml"))
		{
			obj = new XmlDaoFactory();
		}
		else if(factoryType.equals("db"))
		{
			obj = new DbDaoFactory();
		}
		
		return obj;
	}
}

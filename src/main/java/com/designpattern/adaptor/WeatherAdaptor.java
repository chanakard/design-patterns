package com.designpattern.adaptor;

public class WeatherAdaptor {

	public int findTemrature(int zipCode)
	{
		String city = null;
		
		if(zipCode == 1996)
		{
			city = "colombo";
		}
		
		WeatherFinder wf = new WeatherFInderImpl();
		
		return wf.find(city);
	}
}

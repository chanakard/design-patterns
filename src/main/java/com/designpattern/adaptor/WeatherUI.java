package com.designpattern.adaptor;

public class WeatherUI {
	
	public static void main(String[] args) {
		WeatherUI wu = new WeatherUI();
		wu.showTempareture(234);
	}

	public void showTempareture(int zipCode)
	{
		WeatherAdaptor wa = new WeatherAdaptor();
		System.out.println(wa.findTemrature(zipCode));
	}

}

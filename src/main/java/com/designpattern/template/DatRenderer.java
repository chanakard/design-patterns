package com.designpattern.template;

public abstract class DatRenderer {

	public void render()
	{
		String data = readData();
		String processData = processData(data);
		System.out.println(processData);
	}
	
	public abstract String readData();
	
	public abstract String processData(String data);
}

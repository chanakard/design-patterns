package com.designpattern.template.assignment;

public abstract class ComputerManufacturer {

	public void buildComputer()
	{
		String result = addHardDisk() + addRAM() + addKeyBoard();
		System.out.println(String.join(" ", "Computer built ", result));
	}
	
	public abstract String addHardDisk();
	
	public abstract String addRAM();
	
	public abstract String addKeyBoard();
}

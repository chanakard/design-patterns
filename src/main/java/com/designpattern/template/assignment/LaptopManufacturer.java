package com.designpattern.template.assignment;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return " added laptop hard disk";
	}

	@Override
	public String addRAM() {
		return " added laptop ram";
	}

	@Override
	public String addKeyBoard() {
		return " added laptop key board";
	}

}

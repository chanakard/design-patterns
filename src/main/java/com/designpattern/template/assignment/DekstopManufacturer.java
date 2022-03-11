package com.designpattern.template.assignment;

public class DekstopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return " added computer hard disk";
	}

	@Override
	public String addRAM() {
		return " added computer ram";
	}

	@Override
	public String addKeyBoard() {
		return " added computer key board";
	}

}

package com.designpattern.template.assignment;

public class ManufacturerTest {

	public static void main(String[] args) {
		ComputerManufacturer cm = new DekstopManufacturer();
		cm.buildComputer();
	}

}

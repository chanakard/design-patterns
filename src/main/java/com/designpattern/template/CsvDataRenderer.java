package com.designpattern.template;

public class CsvDataRenderer extends DatRenderer {

	@Override
	public String readData() {
		return " CSV Data";
	}

	@Override
	public String processData(String data) {
		return "processed "+data;
	}

}

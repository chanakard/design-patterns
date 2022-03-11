package com.designpattern.template;

public class XmlDataRenderer extends DatRenderer {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		return "processed "+data;
	}

}

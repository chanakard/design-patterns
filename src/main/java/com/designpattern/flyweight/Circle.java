package com.designpattern.flyweight;

public class Circle extends Shape {

	private String label;

	public Circle() {

		this.label = "Circle";
	}

	@Override
	public void draw(int radiuse, String fillCOlor, String lineColor) {

		System.out.println("drawing a " + label + " with radiuse " + radiuse + " fill color " + fillCOlor + " line color "
				+ lineColor);
	}

}

package com.designpattern.flyweight;

public class Rectagle extends Shape {

	private String label;

	public Rectagle() {

		this.label = "Rectagle";
	}

	@Override
	public void draw(int length, int breadth, String fillStyle) {

		System.out.println(
				"drawing a " + label + " with length " + length + " breadth " + breadth + " fill style " + fillStyle);
	}

}

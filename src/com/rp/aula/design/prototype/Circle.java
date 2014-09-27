package com.rp.aula.design.prototype;

public class Circle extends Shape {

	private String name;

	public Circle(String name) {
		this.name = name;
	}

	@Override
	void draw() {
		System.out.println("Circle");
	}

}

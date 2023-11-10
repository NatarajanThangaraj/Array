package com.natarajanthangaraj.problemsolving.practice;

public class Triangle extends Shape {
	public Triangle(float length, float breadth) {
		super(length, breadth);
	}
	@Override
	float findArea() {
		return (float) (0.5) * getLength() * getBreadth();

	}
}

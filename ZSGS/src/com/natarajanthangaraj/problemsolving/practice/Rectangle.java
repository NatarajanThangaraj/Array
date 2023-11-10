package com.natarajanthangaraj.problemsolving.practice;

public class Rectangle extends Shape {

	Rectangle(int length, float breadth) {
		super(length, breadth);
	}
	@Override
	float findArea() {
		return getLength() * getBreadth();
	}

}

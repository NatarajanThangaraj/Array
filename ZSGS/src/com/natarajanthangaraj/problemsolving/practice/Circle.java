package com.natarajanthangaraj.problemsolving.practice;

public class Circle extends Shape{

	Circle(float radius){
		super(radius);
	}

	@Override
	float findArea() {
		return (float)3.14*getRadius()*getRadius();
	}

}

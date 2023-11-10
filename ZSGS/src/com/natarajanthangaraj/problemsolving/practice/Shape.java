package com.natarajanthangaraj.problemsolving.practice;

public abstract class Shape {
	private float length;
	private float breadth;
	private float radius;
	Shape(float length, float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	Shape(float radius){
		this.radius=radius;
	}
	abstract float findArea();
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	

}

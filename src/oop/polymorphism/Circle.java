package oop.polymorphism;

public class Circle extends Shape {
	public double radius;
	private String name;
	

	public Circle(String name,double radius) {
		this.name = name;		
		this.radius = radius;
	
	}	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		area = radius* radius * Math.PI;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "원";
	}

}

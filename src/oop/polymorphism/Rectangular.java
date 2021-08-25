package oop.polymorphism;

public class Rectangular extends Shape {
	private double width;
	private double hight;
	private String name;

	
	
	public Rectangular(String name,double width, double hight) {
		this.name = name;
		this.width = width;
		this.hight = hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	@Override
	public void calculationArea() {
		area = hight * width;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "직사각형";
	}

}

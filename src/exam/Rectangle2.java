package exam;

public class Rectangle2 {
	
	private int width;
	private int height;
	private String color;
	private int area;
	private int length;
	private int perimeter;
	
	


	public Rectangle2 () {
		
	}
	

	
	public Rectangle2(String color, int width, int length) {
		this.color = color;
		this.width = width;
		this.height = length;
		

}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void setLength(int length) {
		this.length = length;
		
	}
	
	public int getLength() {
		return length;
	
	
	}

	public int area() {
		 return this.area = this.width * this.length;
	}

	public int perimeter() {
		 return this.perimeter = this.width*2 + this.length*2;
	}
		
		


	}

	

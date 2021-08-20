package oop.Inheritance;

public class Tea  extends Beverage {
	private String name;
	private String category;
	public Tea() {
		
	}
		
	public Tea (String type, int price , String name, String category) {
		setType(type);
		setPrice(price);
		this.name = name;
		this.category = category;

    }
	
    public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void print() {
    	System.out.println("타입 : "+getType()+", 이름 : "+name+", 가격 :"+getPrice()+", 분류 :"+category);
    }
}

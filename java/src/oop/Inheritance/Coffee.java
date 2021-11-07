package oop.Inheritance;

public class Coffee  extends Beverage {
	String name;
	
	
	
	public Coffee (String type, int price , String name) {
		setType(type);
		setPrice(price);
		this.name = name;

}
	
    public void print() {
    	System.out.println("타입 : "+getType()+", 이름 : "+name+", 가격 :"+getPrice());
    }
}

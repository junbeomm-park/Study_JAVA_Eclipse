package oop.polymorphism;

public class Coffee extends Beverage {
	
	static int amount;
	
	public Coffee() {
		
	}
	

	public Coffee(String name) { //객체가 생성된 것이 커피를 주문하는 것과 동일
		super(name);
		amount++; //수량누적
		calcPrice();//가격계산
		
	}


	@Override
	public void calcPrice() {
		if(getName().equals("Americanno")) {
			price = 1500;
		}else if(getName().equals("CafeLatte")) {
			price = 2500;
		}else if(getName().equals("Cappuccino")) {
			price = 3000;
		}

	}

}

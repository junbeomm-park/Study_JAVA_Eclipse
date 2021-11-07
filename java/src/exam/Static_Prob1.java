package exam;


public class Static_Prob1 {
	public static void main(String[] args){
		
		Drink coffee = new Drink("커피",1500,4);
		Drink tea = new Drink("녹차",1100,7);
		Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);
		
		System.out.println("***** 매 출 전 표 ***** ");
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		
		Alcohol.printTitle();//static메소드를 호출하면서 정확하게 어떤 클래스의 메소드를 호출할지 명시
		wine.printData();//오버라이딩된 메소드가 호출된다.
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + wine.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}

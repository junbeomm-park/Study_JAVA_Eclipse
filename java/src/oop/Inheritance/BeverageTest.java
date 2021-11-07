package oop.Inheritance;

public class BeverageTest {
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee("커피",2500,"아메리카노");
		Coffee coffee2 = new Coffee("커피",2700,"카페라떼");
		Coffee coffee3 = new Coffee("커피",3000,"카푸치노");
		Tea tea1 = new Tea("차",2500,"쟈스민차","허브차");
		Tea tea2 = new Tea("차",2500,"인삼차","건강음료");
		Tea tea3 = new Tea("차",2500,"쌍화차","건강음료");
		
        
		
		coffee1.print();
		coffee2.print();
		coffee3.print();
		tea1.print();
		tea2.print();
		tea3.print();
		
		
	}

}

package exam;

public class Drink {
	 String name;
	 int price;
	 int count;
	 int totalPrice;
	 int total;
	 
	
	
	public Drink(String name, int price, int count) {
		 this.name=name;
		 this.price=price;
		 this.count=count;
	 }
	 public static void printTitle() {
		 System.out.println("상품명   단가   수량   금액");
		 
	 }
	 public void printData() {
		 
		System.out.println(name+"    "+price+"    "+count+"   "+getTotalPrice());
	 }
	  
	 
	 public int getTotalPrice() {
		 totalPrice = count * price;
		 
			return totalPrice;
		}
	public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
			
		}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}

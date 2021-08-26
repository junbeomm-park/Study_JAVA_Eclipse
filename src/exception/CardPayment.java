package exception;

public class CardPayment extends Payment{
	private String cardNumber;
	private String cardPassword;
	private int monthlyinstallment;
	
	public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword,
			int monthlyinstallment) {
		super(shopName, productName, productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyinstallment = monthlyinstallment;
	}
	public String toString() {
		
		return "신용카드가 정상적으로 지불되었습니다"+"\n"+" [신용카드 결제 정보 ]"+"\n"+"상점명 : "+shopName+"\n"+"상품명 : "+productName+"\n"+"상품가격 : "+productPrice+"\n"+"신용카드번호 : "+cardNumber+"\n"+"할부개월수 : "+monthlyinstallment;
			
	}
	
	public void pay() throws PayException{
		
		if(productPrice<0 | monthlyinstallment<0) {
		  throw new PayException ("가격이나 할부개월수가 잘못되었습니다.");
		
	}

}
}
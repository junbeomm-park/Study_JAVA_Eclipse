package exam;

public class CheckingAccount extends Account{
	private String cardNo;			
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accId,long balance, String ownerName, String cardNo) {
		
		super(accId,balance,ownerName);
		this.cardNo = cardNo;
		
	}	
	public String getCardNo() {
			return cardNo;
	}

	public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
	}

	public void pay(long amount, String cardNo) {
		if(this.cardNo.equals(cardNo) & getBalance()>=amount) {
			withdraw(amount);
		}else {
			
			System.out.println("지불이불가능합니다");
			
}
	
	}
}




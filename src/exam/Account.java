package exam;

public class Account {
	 private String accid;
	 private long balance;
	 private String ownerName;
	
	


	public Account() {
		
	}
	
	public Account(String accld, long balance, String ownerName) {
    super();
	this.accid = accld;
	this.balance = balance;
	this.ownerName = ownerName;
	
	
	}
	
	public void deposit(long amount) {
		
		this.balance = balance + amount;
		
		
		
	}
	
	public void withdraw(long amount) {
		
		this.balance = balance - amount;
		
	}
	
	
	
	public String getAccld() {
		return accid;
	}
	public void setAccld(String accld) {
		this.accid = accld;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	

}

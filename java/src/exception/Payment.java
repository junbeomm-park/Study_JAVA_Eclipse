package exception;

public abstract class Payment {
	protected String shopName;
	protected String productName;
	protected long productPrice;
	
	public Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	protected abstract void pay() throws PayException;
	
	
	

}

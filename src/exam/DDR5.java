package exam;

public class DDR5 extends Content {
	String company;
	
	

	public String getGenre() {
		return company;
	}

	public void setGenre(String genre) {
		this.company = genre;
	}

	public DDR5(String title,String company) {
		super(title);
		this.company=company;
	}

	@Override
	public void totalPrice() {
		if(company.equals("LG")) {
			price=100000;
			return;
		}else if(company.equals("SAMSUNG")) {
			price=150000;
			return;
		}else if(company.equals("SK")) {
			price=100000;
		}else {
			price=50000;
		}
			
		

	}

}
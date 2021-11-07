package api.langexam;

public class Vehicle {
	Owner Owner;
	int price;
	String cellPhone;
	

	public String toString() {
	
	return "소요주정보 : 이름은 "+Owner+"이고, "+"차량정보 : 가격은"+price+"입니다";
	

    }
	public void setOwner(Owner owner) {
		this.Owner = owner;
		
	}
	public void setPrice(int price) {
		this.price = price;
						
	}
	public Owner getOwner() {
		return Owner;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (Owner == null) {
			if (other.Owner != null)
				return false;
		} else if (!Owner.equals(other.Owner))
			return false;
		return true;
	}
	
	
}
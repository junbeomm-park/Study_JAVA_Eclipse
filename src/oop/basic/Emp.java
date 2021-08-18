package oop.basic;

public class Emp {
	
	private String id;
	private String name;
	private int baseSalary;
	private String toString;
	private int salary;
	
	
	public void setId(String id) { 
		this.id = id;					
}
	public void setName(String name) { 
		this.name = name;					
}
	public void setBaseSalary(int baseSalary) { 
		this.baseSalary = baseSalary;					
}
	public void setToString(String toString) {
		this.toString = toString;
}   
	public void setSalary(int salary) {
	this.salary = salary;
}			
    public String getId() {
        return this.id;	
}		
    public String getName() {
        return this.name;	
}
			
    public int getBaseSalary() {
        return this.baseSalary;	
               	
}
    public int getSalary() {
    	return this.salary;
}
    public String toString() {
    	System.out.println(this.name+"("+this.id+")" + "사원의 기본급은" + this.baseSalary + "원 입니다.");
    	return this.toString;
    	

}
    public int getSalary(int i) {
	    this.salary = this.baseSalary + this.baseSalary * 30;
		 return this.salary;
}

}



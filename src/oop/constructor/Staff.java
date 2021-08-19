package oop.constructor;

public class Staff {
	private String name;
	private int age;
	private String dept;
	
	
	
	
	
	public Staff(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
}
	public void setName(String name) { 
		this.name = name;					
}
	public void setAge(int age) { 
		this.age = age;
}	
	public void setDept(String dept) { 
		this.dept = dept;
}			
    public String getName() {
        return this.name;		
   		
}
       public int getAge() {
      	 return this.age;

} 
       public String getDept() {
      	 return this.dept;
}
	public void print() {
		System.out.println("이 름 : "+this.name+"   나이 : "+this.age+"    부 서 : "+this.dept);
		
		
	}
}




package oop.Inheritance;




public class Staff extends Person{
	
	private String dept;
	
	public Staff() {
		
	}
	
	
	
	public Staff(String name, int age, String dept) {
		super();
		setName(name); // 부모클래스의 private멤버를 접근할 수 없다. 따라서 메소드를 통해서 접근할 수 있도록 변경
		//this.name = name;
		this.age = age;
		this.dept = dept;
}
	
	
	public void setDept(String dept) { 
		this.dept = dept;
}			
    
       public String getDept() {
      	 return this.dept;
}
	public void print() {
		System.out.println("이 름 : "+name+"   나이 : "+age+"    부 서 : "+dept);
		
		
	}
}





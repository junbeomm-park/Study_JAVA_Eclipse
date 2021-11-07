package oop.Inheritance;

public class Student extends Person {

	private int id;
	
	
	public Student (String name, int age, int id) {
		super(name,age);
//		setName(name);
//		this.age = age;
		this.id = id;
	
}
		
	public void setId(int id) { 
		this.id = id;
}			

    public int getId() {
      	 return this.id;
}
	public void print() {
		
		super.print();
		System.out.println("    학 번 : "+id);
		
	}
}

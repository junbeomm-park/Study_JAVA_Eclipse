package oop.basic;

public class Student {

	private String name;
	private int age;
	private int id;
	
	
	public void setName(String name) { 
		this.name = name;					
}
	public void setAge(int age) { 
		this.age = age;
}	
	public void setId(int id) { 
		this.id = id;
}			
    public String getName() {
        return this.name;		
   		
   }
       public int getAge() {
      	 return this.age;

   } 
       public int getId() {
      	 return this.id;
}
	public void print() {
		System.out.println("이 름 : "+this.name+"   나이 : "+this.age+"    학 번 : "+this.id);
		
	}
}

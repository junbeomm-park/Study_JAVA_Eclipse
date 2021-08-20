package oop.Inheritance;



public class Teacher extends Person{
	
	private String subject;
	
	

	
	public Teacher(String name, int age, String subject) {
		setName(name);
		this.age = age;
		this.subject = subject;
				
	}

	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
    public void print() {
	System.out.println("이 름 : "+name+"   나이 : "+age+"    담당과목 : "+subject);

		
    }		
}




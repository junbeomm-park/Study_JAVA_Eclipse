package oop.polymorphism;

public class Secretary extends Employee{
	public Secretary() {
		
	}
	public Secretary(String name, int number, String department, int salary) {
		super(name,number,department,salary);
	}
	public double tax() {
		double result;
		result = getSalary()*0.10;
		return result;
	}
				
	
	public void incentive(int pay) {
	     setSalary((int) (getSalary() + pay*0.8));
	}
	@Override
	public void employee() {
		
	}
}

	
	


	

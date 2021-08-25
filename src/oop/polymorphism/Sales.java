package oop.polymorphism;

public class Sales extends Employee {
	public Sales() {
		
	}
	public Sales(String name, int number, String department, int salary) {
		super(name,number,department,salary);
	}
	public double tax() {
		double result;
		result = getSalary()*0.13;
		return result;
	}
	public void incentive(int pay) {
		setSalary((int) (getSalary() + pay*1.2));
	}

	@Override
	public void employee() {
		
	}

}

package exam;

public class Student_Prob1 {
	
	private String name;
	private String subject;
	private int fee;
	private int returnFee ;
	private int calcreturnFee;
	
	public Student_Prob1() {
		
	}
	

	public Student_Prob1(String name, String subject,int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getReturnFee() {
		return returnFee;
	}

	public void setReturnFee(int returnFee) {
		this.returnFee = returnFee;
	}

	public int getCalcreturnFee() {
		return calcreturnFee;
	}

	public void setCalcreturnFee(int calcreturnFee) {
		this.calcreturnFee = fee*20/100;
		
	}


	public void print() {
		System.out.println(getName()+"씨의 과정명은 "+subject+" 이고 교육비는 "+fee+" 이며 환급금은"+calcreturnFee+" 입니다.");
		
	}


	
		
	}

	
	  



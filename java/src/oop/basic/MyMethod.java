package oop.basic;
//여러 유형의 메소드를 정의
public class MyMethod {			

	//1. 매개변수가 없고 리턴값이 없는 메소드
	//--> *을 10개 출력하는 기능의 메소드	
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
	     System.out.println();
	
	}
	
	//2. 매개변수가 1개 있고 리턴값이 없는 메소드
	//==> 유연하다. *만 출력하지 않고 외부에서 입력하는 특수문자를 출력하도록 정의
	//      호출할때 전달되는 특수문자를 메모리에 임시보관하기 위해서 str을 선언
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
	     System.out.println();
	}
	
	
	//3. 매개변수가 2개 있고 리턴값이 없는 메소드
	//==> 출력할 특수문자를 입력받고, 출력할 횟수도 입력받아서 처리하기
    //                        --------
	//                         int
	// 
	public void display(String str, int j) {
		for(int i=1;i<=j;i++) {
			System.out.print(str);
			
		}
	     System.out.println();
	}
	
	
	//4. 매개변수가 있고 리턴값이 있는 메소드
	//=> 숫자 2개를 입력받아 더한 결과를 리턴하는 메소드
	public int add(int num1,int num2) {
		int result = 0;
		result = num1+num2;		
		return result;	
	}
	

}

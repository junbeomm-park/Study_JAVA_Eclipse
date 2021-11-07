package basic;



public class IfElseTest{
	public static void main(String[] args){ //java application이 실행되는 시작점
		int jumsu = 80;
		jumsu = 100; //80으로 초기화되어 있던 jumsu변수에 100을 재할당, 가장 마지막에 할당한 값으로 인식
		             //, 재정의를 하기 위해서는 변수의 타입을 선언하지 않고 값을 할당한다.
					 //타입을 추가하는 것은 새로운 변수를 선언하겠다는 의미
		if(jumsu>=90){
			System.out.println(jumsu+"점수는 pass"); 
		}else{
			System.out.println(jumsu+"점수는 fail"); 
		}
	}
}



















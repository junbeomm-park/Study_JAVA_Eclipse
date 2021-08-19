package oop.basic;



//main메소드에 정의했던 내용들을 메소드로 작성해서 호출해보는 연습
//메소드만 모아놓은 클래스
public class MyMethodUtil {
       //1. 매개변수로 전달받은 num을 평가해서 합격인지 불학겹인지 출력하는 메소드 - 매개변수가 있고 리턴값이 없는 메소드
	public void scoreCheck(int num) {
		if(num>=90) {
			System.out.println("점수:"+num+"(합격)");
		}else {
			System.out.println("점수:"+num+"(재시험)");
		}
		
	}
	public int calc(int opr,int num1,int num2) {		
        int result=0;
		switch(opr) {
    	case 1:
    		result = num1+num2;
    		break;
    	case 2:
    		result = num1*num2;
    		break;
    	case 3:
    		result = num1-num2;
    		break;
    	case 4:
    		result = num1/num2;
    		break;
    }
		return result;
		
				
	}
	
	public void printNumber() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("짝수 : "+i);
			}
		}
	}
	public void printGuGu(int dan) {	
		for(int i=1;i<=9;i=i+1) {									
		System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	
	public int getHap(int num) { 
		int sum =0;
		for(int i=1;i<=num;i++) {
			sum = sum+i;
			
		}
		return sum;
			
	}
		
     public void printArray(int[] myarr, String arrName) {
    	 
    	 int evenSum = 0 ; //짝수합
 		int oddSum = 0 ;//홀수합
 		for(int i=0;i<myarr.length;i++) {
 			
 			if(myarr[i]%2==0) {
 				evenSum = evenSum + myarr[i];
 			}else {
 				oddSum = oddSum + myarr[i];
 			}
 		}
 		System.out.println("(배열 "+arrName+")");
 		System.out.println("홀수의합 : "+oddSum);
 		System.out.println("짝수의합 : "+evenSum);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
			
		
    }
		
		
	



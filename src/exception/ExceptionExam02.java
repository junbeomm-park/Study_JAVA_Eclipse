package exception;

import java.util.Scanner;
public class ExceptionExam02 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= scan.nextLine();
		int result= 0;
		//여기를 작성하십시오.
		//convert가 예외를 발생시키는 메소드이므로 try~catch로 처리
		//throws하고 있는 메소드를 호출하면 무조건 try~catch로 처리
		try {
			System.out.println("변환된 숫자는"+convert(str)+"입니다");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}	
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	private static int convert(String str) throws IllegalArgumentException{
	    int result = 0;
	    if(str==null | str.length() ==0) {
			throw new IllegalArgumentException("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
	    }				
	    result = Integer.parseInt(str);
		return result;						
		}
		
}

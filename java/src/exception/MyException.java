package exception;
//사용자정의 Exception만들기
//==> 프로그램을 실행하며 개발자가 원하는 상황을 예외상황으로 등록하기
//1. 사용자정의 클래스를 Exception클래스로 정의하기
public class MyException extends Exception{
	public MyException() {
		super("홀수 입력하지 마세요..");
	}

}

package oop.Inheritance;
//상위클래스
final class SuperB{ //상속이 불가능한 클래스
	//멤버변수(지역변수)에 final을 추가하면 상수의 의미 - 값을 재할당 할 수 없다.
	//  => 자바에서는 상수와 변수를 구분하기 위해 상수는 대문자로 정의하기로 약속
	 public static final int NUM = 100;
	 public final void display() { //하위 클래스에서 재정의할 수 없는 메소드
		 System.out.println("부모의 display()");
	 }
	
}

class SubB extends SuperB{
	public void test() {
		super.NUM=1000;
		System.out.println(NUM);
	}
	public void display() {
		System.out.println("자식의 display()");
	}
	
}
public class FinalTest {
	public static void main(String[] args) {
		SubB obj = new SubB();
		obj.test();

	}

}

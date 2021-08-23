package oop.Inheritance;
// << 상속관계에서 클래스에 정의된 메소드가 갖는 특징>>
// 1. 상위클래스에 정의된 메소드를 하위클래스내부나 하위클래스참조변수를 통해서 호출할 수 있다.
// 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하여 호출하는 경우
//    하위클래스의 메소드가 인식된다.
//    => 상위클래스의 메소드선언부를 하위클래스에서 동일하게 정의하여 사용하는 것을 메소드의 재정의라 한다.
//       즉, 메소드오버라이딩(overriding)이라 한다.
//          ------------------------
//          메소드를 오버라이딩하는 경우 반드시 메소드선언부(리턴타입, 매개변수갯수, 매개변수타입)가 상위클래스와 동일해야 한다.
// 3. super를 이용하면 부모의 메소드도 엑세스가 가능

class Parent{
	public void display() {
		System.out.println("부모클래스의 display()");
	}
}

class Child extends Parent{
	public void test() {
		System.out.println("자식클래스의 test()");
		display(); //1번 테스트코드 = 자기자신의 멤버를 호출하는 경우는 참조변수를 통해 호출하지 않고 그냥 메소드명 정의하여 호출할 수 있다.
		//부모클래스의 display() 호출
		super.display(); // 3번 테스트코드
	}
	public void display() { //2번 테스트코드 - 메소드오버라이딩
		System.out.println("하위클래스의 display()");
		
	}
	
}

public class InheritanceTest02 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display(); //1번 테스트코드
		obj.test();
		

	}

}

package oop.Inheritance;

public class StaticDemoTest02 {
	static {
		//static초기화블럭
		//클래스가 로딩될때 한번 실행해야 하는 코드가 있다면 static블럭에 정의
		//이 블럭 안에 정의되는 코드는 객체 생성할때 호출되는 내용이 아니라 로딩될때 한번만 실행된다.
		//주로 리소스를 사용하는 코드를 정의해서 사용
	}
	public static void main(String[] args) {
		StaticDemo2 obj = new StaticDemo2();
		obj.display(); //외부에서 접근하는 경우 non-static메소드는 참조변수를 통해 액세스
		StaticDemo2.show(); //외부에서 접근하는 경우 static메소드는 클래스명을 이용해서 액세스
		
		//main메소드가 static메소드이므로 동일하게 동작
        test();
        
        StaticDemoTest02 obj2 = new StaticDemoTest02();
        obj2.show();
	}
	public static void test() {
		
	}
	public void show() {
		
	}

}

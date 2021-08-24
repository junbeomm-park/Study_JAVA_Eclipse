package oop.Inheritance;
//클래스메소드와 인스턴스메소드의 차이
// - 메소드 선언부에 static이 추가된 메소드 : 클래스메소드
public class StaticDemo2 {
	int num;
	static int staticNum;
	public static void test() { //클래스메소드
		//1. static메소드에서 static메소드를 호출 - 메소드의 일반적인 접근방법으로 가능
		show();
		System.out.println("test");
	}
	public void display() { //인스턴스메소드 : non-static메소드
		//2. non-static메소드에서 static메소드를 호출 - 메소드의 일반적인 접근방법으로 가능
		test();
		System.out.println("display()");
	}
	public static void show() { //클래스메소드
		//4. static메소드에서 non-static메소드를 호출
		// => static메소드에서 run은 접근할 수 가 없다. static메소드에서 non-static메소드를 액세스하려면 자기 자신 객체의 메소드라고
		//하더라도 new해서 객체를 생성한 후 접근해야 한다.
		StaticDemo2 obj = new StaticDemo2();
		obj.run();
		run(); //잘못된 접근방법
		System.out.println("show()");
	}
	public void run() {
		System.out.println("run()");   
	}
	public void change() { //인스턴스메소드
		//3. non-static메소드에서 non-static메소드를 호출 - 일반적인 접근방법으로 가능
		display();
		System.out.println("change()");
	}
}

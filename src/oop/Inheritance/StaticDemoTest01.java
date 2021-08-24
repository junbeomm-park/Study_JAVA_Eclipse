package oop.Inheritance;

public class StaticDemoTest01 {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		//num은 인스턴수변수이므로 인스턴스를 참조하는 참조변수인 obj1으로 액세스 하면된다.
		//staticNum은 객체가 생성될때마다 객체 내부에 새롭게 만들어지는 변수가 아니라 클래스가 처음 메모리에 로딩될때
		//한 번만 로딩되어 할당되는 변수이므로 객체 즉, 인스턴스의 소유가 될 수 없다.
		//따라서, static멤버들은 참조변수명으로 액세스 하지 않고 클래스명으로 액세스한다.
		//                                        ------------------
		//                                             무조건 클래스명.XXX
		//static멤버인 staticNum은 클래스변수로 모든 객체가 공유해서 사용하는 변수
		//static멤버변수 - 상수
		System.out.println(obj1.num+","+StaticDemo.staticnum);
		
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		System.out.println(obj2.num+","+StaticDemo.staticnum);
		
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		System.out.println(obj3.num+","+StaticDemo.staticnum);

	}

}

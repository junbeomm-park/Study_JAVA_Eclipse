package oop.polymorphism;
interface A{
	
}
interface B{
	
}
interface C extends A{
	
}
class AA{
	
}
class BB{
	
}
class CC{
	
}
class Test extends AA implements C,B{
	
}
public class InterfaceTest02 {
	public static void main(String[] args) {
		AA obj1 = new Test();
		A  obj2 = new Test();
		B  obj3 = new Test();
		C  obj4 = new Test();
		//CC obj5 = new Test();
        Test myobj = new Test();
        if(myobj instanceof AA) {
        	System.out.println("AA의 하위클래스");     	
        }
        if(myobj instanceof A) {
        	System.out.println("A의 하위클래스");     	
        }
        if(myobj instanceof B) {
        	System.out.println("B의 하위클래스");     	
        }
        if(myobj instanceof C) {
        	System.out.println("C의 하위클래스");     	
        }
        //Test객체는 AA,A,B,C타입의 하위객체이므로 4개의 타입으로 선언된 변수에 전달될 수 있다.
        //유연하고 다양한 프로그램을 작성할 수 있다.
        //다중상속활용
        test(myobj);
        test2(myobj);
        test3(myobj);
        test4(myobj);
        
	}
	public static void test(AA obj) {
		
	}
     public static void test2(A obj) {
		
	}
     public static void test3(B obj) {
	
     }
     public static void test4(C obj) {
	
     }


}

package basic;

public class APITest {
	public static void main(String[] args) {
		System.out.println("문자열");
		int i = 10;
		//문자열을 처리하기 위한 기능을 사용하기 위해 String 클래스를 JVM이 인식하는(찾아서 사용할 수 있는, 미리 약속된) 작업공간에 할당
		//                                 -------------------------------------------------------------------
		//                                                    heap에 할당한다는 의미
		//[형식]
		//할당되는클래스타입 변수명  = new heap에 할당해서 사용하고 싶은 클래스명()
		//                         or new heap에 할당해서 사용하고 싶은 클래스명(할당하기 위해 필요한 값1, 값2.......)
		//
		
		//java문자열을 처리하기 위해서 String클래스를 heap에 할당
		//heap할당된 String객체를 APITest.java의 main블럭에서 사용하기 위해서 str변수를 통해 접근할 수 있도록 heap의 주소를 설정
		String str = new String("java");
		Thread t =  new Thread();
		Object o = new Object();
		
		//str이 참조하는(str이 알고 있는) 주소를 가지고 heap에 있는 객체를 참조
		//heap에 할당된 String객체의 length메소드를 참조
		str.length();//메소드호출
	}
}

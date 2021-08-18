package oop.basic;

public class PersonMethodTest {
	public static void main(String[] args) {
		//Person클래스의 객체생성
		Person_Method p1 = new Person_Method();
		//생성된 객체의 멤버변수에 값 셋팅하기
		//private멤버는 외부에서 접근이 불가능
		p1.setName("장동건");
//		p1.name = "장동건";
		p1.setAge(45);
		p1.setAddr("서울시");
		//생성된 객체에 셋팅된 값을 가져오기
		System.out.println("이름:"+p1.getName()+",나이:"+p1.getAge()+",주소:"+p1.getAddr());
		System.out.println("Person객체가 할당된 heap의 주소 : "+p1);
		
		
		Person_Method p2 = new Person_Method();
		p2.setName("박준범");
//		p2.name = "박준범";
		p2.setAge(25);
		p2.setAddr("인천시");
		System.out.println("이름:"+p2.getName()+",나이:"+p2.getAge()+",주소:"+p2.getAddr());
		System.out.println("Person객체가 할당된 heap의 주소 : "+p2);
	}
}

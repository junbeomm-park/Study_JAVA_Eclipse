package oop.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
		obj.setId("jang");
		obj.setName("장동건");
		obj.setPass("1234");
		obj.setTelNum("010");
		obj.setSsn("940408");
		obj.setAddr("서울");
		obj.setNickname("짱");
		obj.print();
		MyConstructor obj2= new MyConstructor("이민호", "lee", "1234");
		obj2.setTelNum("010");
		obj2.setSsn("970201");
		obj2.setAddr("인천");
		obj2.setNickname("F4");
		obj2.print();
		MyConstructor obj3= new MyConstructor("장기용", "jang2", "1234","천안시","010");		
		obj3.setSsn("890201");		
		obj3.setNickname("테스트");
		obj3.print();
		System.out.println("========================");
		MyConstructor obj4= new MyConstructor("김범룡", "kim", "1234","청주시","010","500201","김");		
		obj4.print();
		
				

}
}
package api.lang;

public class Person {
	String name;
	int age;
	String addr;
	public Person() {
		
	}
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//Object클래스의 toString 오버라이딩
//	public String toString() {
//		return "성명:"+getName()+"나이:"+getAge()+"주소:"+getAddr();
//		
//	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	

}

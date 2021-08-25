package oop.polymorphism;
 

interface SuperInterA{
	void show();  //--------- 3번의 예시
	
}
interface InterA{
	void test();
	void display();
}
interface InterB{
	void test2();	
}
interface InterC{
	void test3();
}
interface ChildInter extends InterA,InterB{ //--------- 5,6번의 예시
	
	
}
class TestB extends TestA implements InterA,InterB{ //-------- 7번의 예시

	@Override
	public void test2() {		
	}

	@Override
	public void test() {		
	}

	@Override
	public void display() {		
	}
	
}
class TestA implements SuperInterA{ //-------- 4번의 예시
	@Override
	public void show() { //--------- 3번의 예시
		
	}
	
}
public class InterfaceTest01 {
	public static void main(String[] args) {

	}

}

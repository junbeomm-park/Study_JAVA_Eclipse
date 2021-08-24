package oop.Inheritance;
//클래스변수
//-static변수에 대한 내용
public class StaticDemo {
	int num;
	static int staticnum;
	public StaticDemo() {
		num++;
		staticnum++;
	}
	public void display() {
		System.out.println("num="+num+", staticnum="+staticnum);
	}

}

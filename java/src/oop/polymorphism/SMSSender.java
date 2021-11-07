package oop.polymorphism;

public class SMSSender extends Sender {
	int length;
	public SMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send() {
		System.out.println("SMS로 전송하기");
	}
	
}

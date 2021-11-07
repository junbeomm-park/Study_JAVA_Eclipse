package oop.polymorphism;

public class BandSender extends Sender {
	int length;
	public BandSender(String name,int length){
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
		System.out.println("Band로 전송하기");
	}
	
}

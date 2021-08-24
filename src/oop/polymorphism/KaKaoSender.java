package oop.polymorphism;
//사용자의 요구에 의해서 만들어진 새로운 기능을 포함한 클래스

public class KaKaoSender extends Sender {
	int length;
	public KaKaoSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void send() {
		System.out.println("카카오톡으로 전송");

	}

}

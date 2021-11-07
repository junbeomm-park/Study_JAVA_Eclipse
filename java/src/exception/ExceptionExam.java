package exception;

class BankCustomer{
	// 문제를 잘 읽고 구현하세요.
	String name;
	int currentMoney;
	public BankCustomer(String name, int currentMoney) {
		super();
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	//예외를 호출하는 곳에서 처리할 수 있도록 구현 - 호출하는 곳으로 예외를 던지기, 호출하는 곳으로 예외를 전달하기,
	//                                  호출하는 곳에서 예외를 처리할 수 있도록 알려주기
	public void withdraw(int money) throws IllegalArgumentException {
		// currentMoney가 money보다 작으면 IllegalArgumentException을 발생시키고
		// 예외를 호출하는 곳에서 처리할 수 있도록 구현
		if(currentMoney<money) {
			//IllegalArgumentException예외를 발생시키기
			//예외상황이 아닌데 예외를 발생시킨다.
			throw new IllegalArgumentException("잔액이 부족하여 인출 할 수 없습니다.");
		}
		 currentMoney = currentMoney - money;
	}
}
public class ExceptionExam {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("홍길동", 100);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


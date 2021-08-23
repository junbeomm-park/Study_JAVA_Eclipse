package exam;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333",1000000,"장동건"
					,"1234-5647-8888");
		acc1.pay(500000, "1234-5678-8888");
		System.out.println("현재잔액====>"+acc1.getBalance());
		acc1.pay(500000, "1234-5647-8888");
		System.out.println("현재잔액====>"+acc1.getBalance());
		
		
	}

}

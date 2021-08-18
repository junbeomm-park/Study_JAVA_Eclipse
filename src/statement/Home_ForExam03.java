package statement;

import java.util.Scanner;

public class Home_ForExam03{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("2 ~ 100 사이의 정수를 입력하세요: ");
		int num = key.nextInt();
		int count = 0;//약수의 갯수를 저장하는 변수
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println( num+ "는 (은 ) 소수가 아닙니다.");
		}else {
			System.out.println( num+ "는 (은 ) 소수입니다.");
		}
	}
}

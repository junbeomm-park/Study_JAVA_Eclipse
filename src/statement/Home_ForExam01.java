package statement;

import java.util.Scanner;

public class Home_ForExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1 보다 크고 10 보다 작은 정수를 입력하세요 . : ");
		int dan = key.nextInt();
		if(dan<2 | dan>9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}else {
			for(int i=1;i<=9;i=i+1) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
	}
}

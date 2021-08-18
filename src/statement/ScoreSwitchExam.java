package statement;

import java.util.Scanner;

public class ScoreSwitchExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수입력:");
		int jumsu = key.nextInt();
		if(jumsu<0 | jumsu>100) {
			System.out.println("잘못입력");
		}else {
			//hint : 정수/정수 = 정수
			switch(jumsu/10) {
				case 10:
				case 9:
					System.out.println("A학점");
					break;
				case 8:
					System.out.println("B학점");
					break;
				case 7:
					System.out.println("C학점");
					break;
				case 6:
					System.out.println("D학점");
					break;
				default:
					System.out.println("F학점");
			}
		}
		
	}
}


















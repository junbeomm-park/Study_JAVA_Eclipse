package statement;

import java.util.Scanner;

public class GuGuExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("출력할 단:");
		int dan = key.nextInt();
		
		for(int i=1;i<=9;i=i+1) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}

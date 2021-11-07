package statement;

public class AlphaExam {
	public static void main(String[] args) {
		//ABCDEF....Z
		char c = 'Z';
		System.out.println((int)c);
		for(int i=65;i<=90;i++) {
			System.out.print((char)i);
		}
		System.out.println();
		for(char alpha='A';alpha<='Z';alpha++) {
			System.out.print(alpha);
		}
	}
}

package statement;

public class For2DExam03 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				if(i<=row) {
					System.out.print("*");	
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=row;i++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}
}

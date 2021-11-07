package statement;

public class For2DExam02 {
	public static void main(String[] args) {
		char alpha='A';
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				if(row==i) {
					System.out.print("*\t");
				}else {
					System.out.print(alpha+"\t");
				}
				alpha++;
				
			}
			System.out.println();
		}
	}
}

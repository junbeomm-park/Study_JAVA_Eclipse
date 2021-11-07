package statement;

public class For2DExam01 {
	public static void main(String[] args) {
		int num=1;
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}
}

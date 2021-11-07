package statement;

public class ForExam01 {
	public static void main(String[] args) {
		//1부터 100까지 짝수만 출력하세요..
		//[출력형태]
		//짝수 : 2
		//짝수 : 4
		//짝수 : 6
		// ......
		//짝수 : 100
		for(int i=0;i<=100;i=i+2) {
			System.out.println("짝수 : "+i);
		}
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("짝수 : "+i);
			}
		}

	}
}

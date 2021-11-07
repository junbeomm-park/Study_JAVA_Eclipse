package statement;
//반복제어구문 for문의 문법을 살펴보는 코드
public class ForTest01 {
	public static void main(String[] args) {
		//"자바프로그래밍"이라는 문자열을 10번 출력하세요.
		//i++ => i=i+1
		//int val1 = 5;
		for(int i=1;i<11;i++) {
			System.out.println("자바프로그래밍:"+i);
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("===================================");
		int count = 1;
		for(int i=10;i<=14;i++) {
			System.out.println("자바프로그래밍:"+count);
			//count = count+1;
			count++;
		}
		System.out.println("===================================");
		for(int i=5;i>=1;i--) {
			System.out.println("자바프로그래밍");
		}
	}
}

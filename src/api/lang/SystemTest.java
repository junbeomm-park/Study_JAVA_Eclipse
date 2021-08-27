package api.lang;
//System클래스
public class SystemTest {
	public static void main(String[] args) {
//		long start = System.currentTimeMillis(); //현재시간을 측정 milli (1/1000)
		long start = System.nanoTime();
		int sum = 0;
		for(int i=0;i<=10000;i++) {
			System.out.println(i);
			sum = sum+i;
		}
//		long end = System.currentTimeMillis();
		long end = System.nanoTime();
		
		System.out.println("프로그램 실행시간:"+(end-start));

	}

}

package statement;

public class HapExam {
	public static void main(String[] args) {
		int sum = 0;//총합
		int evenSum = 0 ; //짝수합
		int oddSum = 0 ;//홀수합
		for(int i=1;i<=100;i++) {
			//총합을 저장해야 하는 변수에 1부터 100까지 합이 더해지도록 처리
			sum = sum+i;
			//System.out.println("sum="+sum+",i="+i);
			//홀수인지 짝수인지 검사해서 각각 홀수합변수와 짝수합변수에 더해지도록 처리
			if(i%2==0) {
				evenSum = evenSum+i;
			}else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("총합:"+sum);
		System.out.println("짝수합:"+evenSum);
		System.out.println("홀수합:"+oddSum);
		
	}
}

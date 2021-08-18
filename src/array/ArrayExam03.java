package array;
public class ArrayExam03 {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int evenSum = 0 ; //짝수합
		int oddSum = 0 ;//홀수합
		for(int i=0;i<ia.length;i++) {
			
			if(ia[i]%2==0) {
				evenSum = evenSum+ia[i];
			}else {
				oddSum = oddSum + ia[i];
			}
		}
		System.out.println("(배열 ia)");
		System.out.println("홀수의합 : "+oddSum);
		System.out.println("짝수의합 : "+evenSum);
		
		
		
		evenSum = 0 ; //짝수합
		oddSum = 0 ;//홀수합
		for(int i=0;i<ib.length;i++) {
			
			if(ib[i]%2==0) {
				evenSum = evenSum+ib[i];
			}else {
				oddSum = oddSum + ib[i];
			}
		}
		System.out.println("(배열 ib)");
		System.out.println("홀수의합 : "+oddSum);
		System.out.println("짝수의합 : "+evenSum);
	}
	
	
}

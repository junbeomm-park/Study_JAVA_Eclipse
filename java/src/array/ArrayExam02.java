package array;

public class ArrayExam02 {
	public static void main(String[] args) {
		//int형 배열변수를 선언하고 
		//98,100,78,99,86으로 초기화
		//배열에 저장된 점수의 합계와 평균을 출력하기
		//[출력형태]
		//배열요소의 총합:_____
		//배열요소의 평균:_____
		int[] myarr = {98,100,78,99,86};
		double avg = 0.0;
		int total = 0;//총합을 저장할 변수
		for(int i=0;i<myarr.length;i++) {
			total = total + myarr[i];
		}
		avg = (double)total/myarr.length;
		System.out.println("배열요소의 총합:"+total);
		System.out.println("배열요소의 평균:"+(total/myarr.length));
		System.out.println("배열요소의 평균:"+avg);
	}
}

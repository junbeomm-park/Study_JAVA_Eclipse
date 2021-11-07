package basic;
/*
ScoreExam.java 작성
1. 변수를 세 개 선언
2. 국어, 영어, 수학 점수를 임의로 저장
3. 출력결과를 다음과 같이 작성
   [출력결과]
   총점 : ________
   평균 : ________

   메일로 전송

*/
public class ScoreExam{
	public static void main(String[] args){
		int kor = 90;
		int math = 100;
		int eng = 90;
		int totalVal = kor + math + eng;
		//int avg = total/3;
		float avg = totalVal/3;
		System.out.println("총점:"+ totalVal);
		System.out.println("평균:"+ avg);

	}
}
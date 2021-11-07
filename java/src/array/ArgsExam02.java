package array;

public class ArgsExam02 {
	public static void main(String[] args) {
		//명령행매개변수로 숫자5개 입력 받고 홀수인지 짝수인지 출력하기
		//[출력형태]
		//명령행매개변수1:100 -> 짝수
		//....
		for(int i=0;i<args.length;i++) {
			if(Integer.parseInt(args[i])%2==0) {
				System.out.println("명령행매개변수"+(i+1)+":"+args[i]+"->짝수");
			}else {
				System.out.println("명령행매개변수"+(i+1)+":"+args[i]+"->홀수");
			}
		}
		
	}

}

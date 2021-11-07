package statement;

import java.util.Random;

import oop.basic.MyMethod;
import oop.basic.MyMethodUtil;

//if~else를 연습
public class IfTest01 {
	public static void main(String[] args) {
		//num변수에 1부터 100까지의 랜덤수를 발생시키고 90이상이면 합격출력
		//나머지는 재시험으로 출력하기
		//[출력형태]
		//점수:____(____)
		//ex) 점수:89(재시험)
		//    점수:93(합격)
		Random rand = new Random();
		MyMethodUtil util = new MyMethodUtil();
		int num = rand.nextInt(100)+1;
		//MyMethodUtil클래스에 정의한 scoreCheck호출
		//MyMethodUtil로 분리한 메소드를 호출해서 결과를 동일하게 확인
		util.scoreCheck(num);
	}
}

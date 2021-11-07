package basic;

import java.util.Random;

//기본형과 참조형 변수의 비교
public class VariableTest {
	public static void main(String[] args) {
		//기본형변수
		int i = 10;
		int j = 10;
		System.out.println("==============기본형=============");
		if(i==j) {
			System.out.println("기본형같다.");
		}else {
			System.out.println("기본형다르다.");
		}
		
		//참조형변수
		String str1 = new String("java");
		String str2 = new String("java");
		System.out.println("==============참조형=============");
		//참조형변수에서 ==은 주소의 비교
		str1=str2;
		if(str1==str2) {
			System.out.println("참조형같다.");
		}else {
			System.out.println("참조형다르다.");
		}
		
		//문자열비교 - String클래스의 메소드로 처리
		//boolean result = str2.equals(str1)
		if(str1.equals(str2)){
			System.out.println("문자열같다.");
		}else {
			System.out.println("문자열다르다.");
		} 
		
		System.out.println("============================================");
		//참조형과 기본형 변수에 저장된 값 확인하기
		int num = 100;//기본형
		Random rand = new Random();//참조형
		Random rand2 = new Random();//참조형
		System.out.println("기본형:"+num);
		System.out.println("참조형:"+rand);
		System.out.println("참조형:"+rand2);
		
	}
}


















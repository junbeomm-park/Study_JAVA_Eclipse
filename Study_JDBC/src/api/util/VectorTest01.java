package api.util;
//List구조의 하위 클래스인 Vector의 사용방법

import java.util.Vector;

public class VectorTest01 {
	public static void main(String[] args) {
		//1. Vector의 생성 - 5.0 이후 버전부터 <>안에 Vector에 저장되는 데이터의 타입을 명시해야 한다.
		//								 ------------------
		//								 Generic이라 한다.
		//=> Vector안에 저장되는 데이터의 타입을 제한(기본형인 경우에는 Wrapper타입을 명시)
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		System.out.println("현재 벡터의 용량=>"+v.capacity());
		System.out.println("현재 벡터에 저장된 요소의 개수=>"+v.size());
		
		for (int i = 0; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("현재 벡터의 용량=>"+v.capacity());
		System.out.println("현재 벡터에 저장된 요소의 개수=>"+v.size());
		
		System.out.println("벡터에 저장된 0번 요소=>"+v.get(0));
		
		//Vector에 저장된 모든 요소를 꺼내기 - 선형구조라 즉, 배열과 동일한 구조를 갖고 있는 자료구조(for문으로 탐색이 가능)
		for (int i = 0; i < v.size(); i++) {
			int data = v.get(i); //오토언박싱 - 자동으로 컴파일러가 Integer객체를 int로 변환해서 변수에 저장
			System.out.println(i+"번째 요소=>"+data);
		}
	}
}

package api.util.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		//HastSet으로 집합(set1) 만들기 - 10,20,30,50,60,100
		//HastSet으로 집합(set2) 만들기 - 30,60,90,120
		//두 집합의 값을 출력하고 교집합을 출력하기
		//[출력형태]
		// 집합 1 :
		// 집합 2 :
		// 집합1과 집합2의 교집합 : 
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(50);
		set1.add(60);
		set1.add(100);
		print(set1,"집합 1 :");
	
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(30);
		set2.add(60);
		set2.add(90);
		set2.add(120);
		print(set2,"집합 2 :");
	
		
		
		set2.retainAll(set1);
		print(set2,"집합1과 집합2의 교집합 : ");
		System.out.println(set2);
	
	}
	public static void print(Set<Integer> set,String msg) {
		Iterator<Integer> it = set.iterator();//1. Iterator로 변환
		System.out.println(msg);
		while(it.hasNext()) { //2. Iterator에 저장된 요소가 있는지 확인
			int element = it.next(); //3. Iterator에 저장된 요소를 꺼내기
			System.out.println( element + "\t");
		}
		System.out.println();
		System.out.println("=================================");
	}
}

	
	


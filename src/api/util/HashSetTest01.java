package api.util;

import java.util.HashSet;
import java.util.Iterator;

//집합의 구조 - List와 다르게 중복된 데이터를 저장할 수 없다.
//자료구조는 데이터의 저장/꺼내기가 중요
public class HashSetTest01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		set.add("servlet");
		set.add("jsp");
		System.out.println("요소의 갯수 : "+set.size());
		
		//Set은 선형구조가 아니라 순서대로 읽어올 수 없다. (for문을 이용해서 i값을 변화시키며 액세스하는 것이 불가능)
		//모든 자료 구조들의 표준 포맷인 Iterator로 변환하고 읽어와야 한다.
		//1. HashSet을 Iterator로 변환하기
		Iterator<String> it = set.iterator();
		//2. Iterator로 변환하기
		while(it.hasNext()) {// Iterator안에 엘리먼트가 있는지 없는지 확인 - 있으면 true 없으면 false를 리턴
			String element = it.next();  //next()는 Iterator에서 엘리먼트 꺼내기
			System.out.println("set에 저장된요소 =>" + element);
		}
	}
}

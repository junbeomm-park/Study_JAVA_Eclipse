package api.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

//향상된 for문을 이용하여 List,Set,Map을 접근할 수 있다.
//jdk5.0이후에 사용가능하도록 
//for(변수 : collection객체) { 
//         ---------------
//              자료구조
//      반복해서 실행할 명령문
//}
public class CollectionTest {
	public static void main(String[] args) {
		//배열
		int[] arr = new int[] {10,20,30,40,50} ;
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("=========================");
		//List
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("oracle");
		list.add("swing");
		list.add("servlet");
		list.add("jsp");
		for(String data : list) {
			System.out.println(data);
		}
		System.out.println("=========================");
		//Set
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		for(String data : set) {
			System.out.println(data);
		}
		System.out.println("=========================");
		//Map
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "jang");
		map.put("pass", "1234");
		map.put("name", "장동건");
		map.put("addr", "서울");
		map.put("point", "1000");
		map.put("deptno", "100");
		Collection<String> changeMap = map.values();
		for(String data : changeMap) {
			System.out.println(data);
		}
	}
}

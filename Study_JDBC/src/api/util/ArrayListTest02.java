package api.util;

import java.util.ArrayList;
//List는 중복이 허용된다.
public class ArrayListTest02 {
	public static void main(String[] args) {
		//String데이터가 저장될 ArrayList를 생성하고
		//java,oracle,swing,servlet,jsp의 문자열을 저장
		//ArrayList에 저장된 모든 요소를 출력하기
		ArrayList<String> v = new ArrayList<>();
		v.add("java");
		v.add("oracle");
		v.add("swing");
		v.add("servlet");
		v.add("jsp");
		v.add("servlet");
		v.add("jsp");

		for (int i = 0; i < v.size(); i++) {
			String data = v.get(i);
			System.out.println(i+"번째 요소=>"+data);
		}
	}
}

package api.util.exam;

import java.util.ArrayList;

public class ArrayListExam01 {
	public static void main(String[] args) {
		
			//77,99,100,95,100점을 ArrayList에 저장하고 총점과 평군을 구해서 출력
			//[출력형태]
			//ArrayList에 저장된 모든 요소의 합 :
			//ArrayList에 저장된 모든 요소의 평균 :
			ArrayList<Integer> v = new ArrayList<>();
			v.add(78);
			v.add(99);
			v.add(100);
			v.add(95);
			v.add(100);
			
			double avg = 0;
			int total = 0;
			
			for (int i = 0; i < v.size(); i++) {
				total = total + v.get(i);// total = total+v[i]			
			}
				avg = (double)total/ v.size();
				System.out.println("ArrayList에 저장된 모든 요소의 합 :"+total);
				System.out.println("ArrayList에 저장된 모든 요소의 평균 :"+avg);
		}
	}



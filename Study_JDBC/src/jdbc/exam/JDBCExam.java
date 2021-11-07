package jdbc.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class JDBCExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******검색********");
		System.out.print("1. 전체 부서 검색:");
		System.out.print("2. 부서명검색:");
		System.out.print("3. 위치로검색:");
		int selectNum = key.nextInt();
		MyDeptDAO dao = new MyDeptDAO();
		ArrayList<MyDeptDTO> deptlist = null;
		switch(selectNum) {
			case 1:
				deptlist = dao.getDeptList();
				//메소드 호출 결과를 출력하기
				break;
			case 2:
				System.out.print("부서명:");
				String deptname = key.next();
				deptlist = dao.findByDeptName(deptname);
				//메소드 호출 결과를 출력하기
				break;
			case 3:
				System.out.print("위치:");
				String loc = key.next();
				deptlist = dao.findByLoc(loc);
				//메소드 호출 결과를 출력하기
				break;
				
		}
	for (int i = 0; i < deptlist.size(); i++) {
		MyDeptDTO dept = deptlist.get(i);
		System.out.println(dept.getDeptno()+","+dept.getDeptname()+","+dept.getLoc()+","+dept.getMgr());
	}
}
}

package jdbc.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDeptInsertTest {
	public static void main(String[] args) {
		MyDeptDAO dao = new MyDeptDAO();
		Scanner key = new Scanner(System.in);
		System.out.print("부서번호:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("관리자번호:");
		String mgr = key.next();
		MyDeptDTO dept = new MyDeptDTO(deptno, deptname, loc, mgr);
		dao.insert(dept);
	}
	
}





package PreparedStatement.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.MemberDAO;
import jdbc.MemberDTO;


public class PreparedStatementInsertTest {
	public static void main(String[] args) {
		/* PreparedStatementInsertTest obj = new PreparedStatementInsertTest(); */
		MemberDAO dao = new MemberDAO();
		Scanner key = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = key.next();
		System.out.print("패스워드 : ");
		String pass = key.next();
		System.out.print("성명 : ");
		String name = key.next();
		System.out.print("주소 : ");
		String addr = key.next();
		System.out.print("부서번호 : ");
		String deptno = key.next();
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		dao.insert(user);
		/* dao.insert(id, pass, name, addr, deptno); */
			
	}
	public void insert(String id, String pass, String name, String addr, String deptno) {
		String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
		String user = "scott";
		String password = "tiger";
		//SQL문을 정의 - 외부에서 입력받을 부분은 ?로 처리 (?와 다른 값을 연결할 수 없다.)
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;	
			
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("커넥션성공!"+ con);
			
			//PreparedStatement 생성
			stmt = con.prepareStatement(sql);
			//?에 대한 값을 셋팅하기
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, addr);
			stmt.setString(5, deptno);
			//sql문을 실행 - 매개변수가 없는 executeUpdate호출
			
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공!");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			}try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}



package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBMS의 자원을 액세스하는 공통의 기능이 정의된 클래스
// => DB접속, 드라이버로딩, 자원반납, 트랜잭션처리
public class DBUtil {
	//드라이버로딩
	//시스템 내부의 클래스가 사용되며 메모리에 로딩될때 static{}안의 메소드가 자동으로 로딩
	//=> 메소드마다 드라이버로딩하는 작업을 구현하지 않고 클래스로더가 작업클래스를 로딩할때
	//	 전체 시스템에서 한 번만 실행되도록 작업하기 위해 static블럭안에 코드를 작성
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//커넥션하기 - 커넥션은 모든 DB관련 작업을 할때 무조건 필요한 기능
	//		    모든 DB연봉 메소드에서 getConnect를 호출해서 DBMS에 연결을 하고 작업을 해야 하기 때문에
	//          이 메소드를 호출하는 곳에서 커넥션객체를 받아야한다. 따라서 리턴해야 한다.
	//          => 요청이 들어오면 DB에 접속하고 접속정보로 커넥션객체를 만들어서 리턴하는 메소드
	public static Connection getConnect() {
		String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//자원반납 - ResultSet, Statement, Connection
	//=> 한꺼번에 모든 자원을 해제하도록 메소드를 작성해도 좋고, 자원 하나를 해제하는 메소드를 각각 정의해도 좋다.
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//커넥션을 반납하는 메소드
	public static void close(Connection con) {
		try {
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Statement를 반납하는 메소드	
	//ResultSet을 반납하는 메소드
	

	
}

	


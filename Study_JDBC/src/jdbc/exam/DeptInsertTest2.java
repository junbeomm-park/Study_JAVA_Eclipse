package jdbc.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DeptInsertTest2 {
	public static void main(String[] args) {
		
			String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
			String user = "scott";
			String password = "tiger";
			String sql = "insert into mydept values('300','총무부','10층','hong')";
			Connection con = null;
			Statement stmt = null;	
			
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버로딩성공!");
				con = DriverManager.getConnection(url,user,password);
				System.out.println("커넥션성공!"+ con);
				stmt = con.createStatement();
				System.out.println("Statement객체 생성완료" + stmt);
				int result = stmt.executeUpdate(sql);
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

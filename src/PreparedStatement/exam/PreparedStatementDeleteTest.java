package PreparedStatement.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDeleteTest {
	public static void main(String[] args) {
		PreparedStatementDeleteTest obj = new PreparedStatementDeleteTest();
			Scanner key = new Scanner(System.in);
			System.out.println("삭제할 id : ");
			String id = key.next();
			
			obj.delete(id);
			
	}
	
			public void delete(String id) {
		
			String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
			String user = "scott";
			String password = "tiger";
			StringBuffer sql = new StringBuffer();
			sql.append("delete from member ");
			sql.append("where id=? ");
			Connection con = null;
			Statement stmt = null;
					
			
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버로딩성공!");
				
				con = DriverManager.getConnection(url,user,password);
				System.out.println("커넥션성공!"+ con);
				
				stmt = con.prepareStatement(sql.toString());
				((PreparedStatement) stmt).setString(1, id);
				System.out.println("Statement객체 생성완료" + stmt);
				
				int result = ((PreparedStatement) stmt).executeUpdate();
				System.out.println(result+"개 행 삭제성공!");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(stmt!=null) stmt.close();
					if(con!=null) con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

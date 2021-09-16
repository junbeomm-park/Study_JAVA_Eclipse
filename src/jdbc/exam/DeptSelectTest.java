package jdbc.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DeptSelectTest {
	public static void main(String[] args) {
		
			String url = "jdbc:oracle:thin:@121.131.193.103:1521:xe";
			String user = "scott";
			String password = "tiger";
			StringBuffer sql = new StringBuffer();
			sql.append("select * from mydept");	
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버로딩성공!");
				con = DriverManager.getConnection(url,user,password);
				System.out.println("커넥션성공!"+ con);
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql.toString());
				System.out.println("조회성공-"+rs);
			
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.println(rs.getString(4)+"\t");
					
				}	
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null) rs.close();
					if(stmt!=null) stmt.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
package jdbc.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.DBUtil;

public class MyDeptDAO {
	public void insert(MyDeptDTO user) {
		System.out.println("웹페이지에 사용자가 입력한 데이터:"+user);
		String sql = "insert into mydept values(?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, user.getDeptno());
			stmt.setString(2, user.getDeptname());
			stmt.setString(3, user.getLoc());
			stmt.setString(4, user.getMgr());
			
				
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	}
	// insert
	public void insert(String deptno, String deptname, String loc, String mgr) {
		String sql = "insert into member values(?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;			
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, deptno);
			stmt.setString(2, deptname);
			stmt.setString(3, loc);
			stmt.setString(4, mgr);
			
				
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	}
	//update
	public void update(String deptno,String loc) {
		
		String sql = "update mydept ";
		sql = sql + "set loc=? ";
		sql = sql + "where deptno=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);	
			stmt.setString(1, loc);
			stmt.setString(2, deptno);
			System.out.println("Statement객체 생성완료" + stmt);
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 수정성공~!~!~!~!");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,stmt,con);
		}	
	}
	//delete
	public void delete(String deptno) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from mydept ");
		sql.append("where deptno=? ");
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			System.out.println("커넥션성공!"+ con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, deptno);
			System.out.println("Statement객체 생성완료" + stmt);
			int result =  stmt.executeUpdate();
			System.out.println(result+"개 행 삭제성공!!!~~!~~~!~##");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt,con);
		}
	}
	public void select() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from mydept");	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql.toString());
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getString(4));
				
			}	
			System.out.println("조회성공 ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
	}
}





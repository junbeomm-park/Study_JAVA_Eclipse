package mydept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import member.DBUtil;
import member.MemberDTO;



public class MyDeptDAO {
	public int insert(MyDeptDTO user) {
		System.out.println("웹페이지에 사용자가 입력한 데이터:"+user);
		String sql = "insert into mydept values(?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, user.getDeptno());
			stmt.setString(2, user.getDeptname());
			stmt.setString(3, user.getLoc());
			stmt.setString(4, user.getMgr());
			
				
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
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
	public int delete(String deptno) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from mydept ");
		sql.append("where deptno=? ");
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			System.out.println("커넥션성공!"+ con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, deptno);
			System.out.println("Statement객체 생성완료" + stmt);
			result =  stmt.executeUpdate();
			System.out.println(result+"개 행 삭제성공!!!~~!~~~!~##");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt,con);
		}
		return result;
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
	public ArrayList<MyDeptDTO> getDeptList() {
		
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		String sql = "select * from mydept";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				dept = new MyDeptDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				deptlist.add(dept);
				
			}	
			System.out.println("조회성공 ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return deptlist;
}
	
	
	public ArrayList<MyDeptDTO> findByDeptName(String deptname) {
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();	
		String sql = "select * from mydept where deptname = ?";	
		MyDeptDTO dept = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, deptname);
			rs = stmt.executeQuery();
			while(rs.next()) {
				dept = new MyDeptDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				deptlist.add(dept);
				
			}	
			
			System.out.println("조회성공 ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return deptlist;
	}
	
	
	public ArrayList<MyDeptDTO> findByLoc(String loc) {
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		String sql = "select * from mydept where loc = ?";	
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, loc);
			rs = stmt.executeQuery();
			while(rs.next()) {
				dept = new MyDeptDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				deptlist.add(dept);
				
			}	
			System.out.println("조회성공 ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return deptlist;
	}
	public ArrayList<MyDeptDTO> search(String search) {
		ArrayList<MyDeptDTO> searchlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO user = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from mydept where loc = ? ");	
		
			
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, search);
			rs = stmt.executeQuery();
			while(rs.next()) {
				user = new MyDeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4) 
						);
				searchlist.add(user);
			}	
			System.out.println("조회성공 ~!~!~!!%#!@#"+searchlist.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return searchlist;
		
}
}




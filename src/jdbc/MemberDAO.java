package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//member테이블을 액세스하는 기능을 갖고 있는 클래스
//=> member테이블을 통해서 구현해야 하는 모든 기능을 메소드로 정의
public class MemberDAO {
	//매개변수로 사용자가 입력한 값을 표현한 DTO객체를 받도록 작성
	public void insert(MemberDTO user) {
		System.out.println("웹페이지에 사용자가 입력한 데이터:"+user); //user.toString()호출한 것과 동일
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;			
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getName());
			stmt.setString(4, user.getAddr());
			stmt.setString(5, user.getDeptno());
				
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	}
	//member테이블에 insert하기 - 회원가입기능
	public void insert(String id, String pass, String name, String addr, String deptno) {
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;			
		try {			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, addr);
			stmt.setString(5, deptno);
				
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공~~~~~");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	}

    //member테이블 update - 회원정보수정
	public void update(String id,  String addr) {
		
		
		String sql = "update member ";
		sql = sql+"set addr=? ";
		sql = sql+"where id=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);	
			stmt.setString(1, addr);
			stmt.setString(2, id);
			System.out.println("Statement객체 생성완료" + stmt);
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 수정성공~!~!~!~!");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,stmt,con);
		}	
	}
	//member테이블의 데이터를 삭제하는 메소드 - 회원탈퇴기능
	public void delete(String id) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from member ");
		sql.append("where id=? ");
		Connection con = null;
		PreparedStatement stmt = null;
				
		
		try {
			con = DBUtil.getConnect();
			System.out.println("커넥션성공!"+ con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			System.out.println("Statement객체 생성완료" + stmt);
			int result =  stmt.executeUpdate();
			System.out.println(result+"개 행 삭제성공!!!~~!~~~!~##");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt,con);
		}
	}
	//member테이블의 전체 레코드를 조회하는 메소드 - 회원목록조회
	public void select() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql.toString());
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.println(rs.getString(6));
			}	
			System.out.println("조회성공 ~!~!~!!%#!@#");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
	}
}

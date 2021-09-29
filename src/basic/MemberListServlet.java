package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.DBUtil;
import member.MemberDAO;
import member.MemberDTO;

@WebServlet(name = "memberlist", urlPatterns = { "/member/list.do" })
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> userlist = dao.getMemberList();
		
		request.setAttribute("userlist", userlist);
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
		
//		out.print("<h2>회원목록보기</h2>");
//		out.print("<table border='1' width='600'>");
//		out.print("<tr>");
//		out.print("<th>아이디</th><th>패스워드</th><th>이름</th>");
//		out.print("<th>주소</th><th>포인트</th><th>부서번호</th>");
//		out.print("<th>삭제</th>");
//		out.print("</tr>");
//		for (int i = 0; i < userlist.size(); i++) {
//			out.print("<tr>");
//			MemberDTO user = userlist.get(i);
//			out.print("<td>"+user.getId()+"</td>");
//			out.print("<td>"+user.getPass()+"</td>");
//			out.print("<td>"+user.getName()+"</td>");
//			out.print("<td>"+user.getAddr()+"</td>");
//			out.print("<td>"+user.getPoint()+"</td>");
//			out.println("<td>"+user.getDeptno()+"<br>");
//			out.println("<td><a href='/serverweb/member/delete.do?id="+user.getId()+"'>삭제</a><br>");
//			out.print("</tr>");
//		}
		
		//응답뷰를 별도의 파일을 분리한 후 서블릿에서 응답하기 전에 재요청해서 실행되도록 작업
		//=> 요청재지정
//		response.sendRedirect("/serverweb/member/result.jsp");
		
	}
}








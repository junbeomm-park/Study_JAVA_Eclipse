package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberDTO;

@WebServlet(name = "memberInsert", urlPatterns = { "/member/Insert.do" })
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		int result = dao.insert(user);
		
		/*
		 * if(result>=1) { out.print(result+"개 행 삽입성공~~~~~"); }else { out.print("삽입실패");
		 * }
		 */
		// 결과로 새로운 서블릿을 요청하기 - 요청재지정
		response.sendRedirect("/serverweb/member/list.do");
	}
}

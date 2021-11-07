package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;


@WebServlet(name = "memberDelete", urlPatterns = { "/member/delete.do" })
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		int result = dao.delete(id);
//		if(result>=1) {
//			out.print(result+"개 행 삭제성공~~~~~");
//		}else {
//			out.print("삭제실패");
//		}
		// 결과로 새로운 서블릿을 요청하기 - 요청재지정(클라이언트에서 새롭게 요청하는 것과 동일한 작업)
		response.sendRedirect("/serverweb/member/list.do");
	}

}

package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberDTO;


@WebServlet(name = "memberRead", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.read(id);
		//4. 데이터공유
		request.setAttribute("user", dto);
		//5. 요청재지정
		RequestDispatcher rd = request.getRequestDispatcher("/member/member_read.jsp");
		rd.forward(request, response);
		
	}

}

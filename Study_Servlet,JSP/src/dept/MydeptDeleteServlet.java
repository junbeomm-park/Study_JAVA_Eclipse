package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mydept.MyDeptDAO;

@WebServlet(name = "mydeptDelete", urlPatterns = { "/mydept/Delete.do" })
public class MydeptDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String deptno = request.getParameter("deptno");
		
		MyDeptDAO dao = new MyDeptDAO();
		int result = dao.delete(deptno);
		
		response.sendRedirect("/serverweb/mydept/List.do");
	}

}

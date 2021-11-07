package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mydept.MyDeptDAO;
import mydept.MyDeptDTO;

@WebServlet(name = "mydeptsearch", urlPatterns = { "/mydept/search.do" })
public class MydeptSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String loc = request.getParameter("search");
		
		MyDeptDAO dao = new MyDeptDAO();
		ArrayList<MyDeptDTO> deptlist = dao.search(loc);
		out.print("<h2>사원목록보기</h2>");
		out.print("<table border='1' width='600'>");
		out.print("<tr>");
		out.print("<th>사번</th><th>사무실이름</th><th>LOC</th>");
		out.print("<th>MGR</th>");
		out.print("<th>삭제</th>");
		out.print("</tr>");
		for (int i = 0; i < deptlist.size(); i++) {
			out.print("<tr>");
			MyDeptDTO dept = deptlist.get(i);
			out.print("<td>"+dept.getDeptno()+"</td>");
			out.print("<td>"+dept.getDeptname()+"</td>");
			out.print("<td>"+dept.getLoc()+"</td>");
			out.print("<td>"+dept.getMgr()+"<br>");
			
			
			out.println("<td><a href='/serverweb/mydept/Delete.do?deptno="+dept.getDeptno()+"'>삭제</a><br>");
			out.print("</tr>");
	}
	}
}

package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mydept.MyDeptDAO;
import mydept.MyDeptDTO;

@WebServlet(name = "insert", urlPatterns = { "/mydept/insert.do" })
public class MydeptInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String deptno = request.getParameter("deptno");
		String deptname = request.getParameter("deptname");
		String loc = request.getParameter("loc");
		String mgr = request.getParameter("mgr");
		
		MyDeptDAO dao = new MyDeptDAO();
		MyDeptDTO user = new MyDeptDTO(deptno, deptname, loc, mgr);
		int result = dao.insert(user);
		
		if(result>=1) { 
			out.print(result+"개 행 삽입성공~~~~~"); 
			}else { out.print("삽입실패");
		  }
	}

}

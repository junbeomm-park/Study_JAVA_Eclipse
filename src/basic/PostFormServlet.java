package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost", urlPatterns = { "/mypost.do" })
public class PostFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String pass = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] favorites = request.getParameterValues("item");
		System.out.println("아이디 : "+id);
		System.out.println("이름 : "+name);
		System.out.println("비밀번호 : "+pass);
		System.out.println("성별 : "+gender);
		System.out.println("직업 : "+job);
		for  (int i = 0; i < favorites.length; i++) {
			System.out.println("favorites : "+favorites[i]);
			  }	
		
		
		PrintWriter out = response.getWriter();
		out.print("<h2>아이디 : "+id+"</h2>");
		out.print("<h2>이름 : "+name+"</h2>");
		out.print("<h2>비밀번호 : "+pass+"</h2>");
		out.print("<h2>성별 : "+gender+"</h2>");
		out.print("<h2>직업 : "+job+"</h2>");
		out.print("<h2>favorites : ");	
		for  (int i = 0; i < favorites.length; i++) {
			   out.println(favorites[i] + " ");
		 }
		out.print("</h2>");
	}
	
}

package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/member/login.do" })
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//요청메시지의 한글에 대한 charset설정 - 요청메시지 추출 전에 작업
		request.setCharacterEncoding("UTF-8");
		//0. response될 데이터의 형식(MIME type)과 문자셋을 정의
		response.setContentType("text/html;charset=UTF-8");
		//클라이언트가 입력한 데이터를 추출
		//=> 클라이언트가 입력한 정보, 클라이언트에 설정된 정보는 모두 HttpServletRequest객체에 저장되어 있다.
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		//클라이언트가 입력한 데이터를 콘솔에 출력하기
		System.out.println("아이디 : "+id);
		System.out.println("패스워드 : "+pass);
		//클라이언트가 입력한 데이터를 화면에 출력하기
		
		//1. response에 출력하는 일을 담당하는 객체를 얻어오기
		PrintWriter out = response.getWriter();
		//2. PrintWriter객체의 메소드를 통해서 출력하기
		out.print("<h2>아이디 : "+id+"</h2>");
		out.print("<h2>패스워드 : "+pass+"</h2>");
	}

}

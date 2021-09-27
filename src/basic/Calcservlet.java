package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calc", urlPatterns = { "/calc.do" })
public class Calcservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//사전작업
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//1. 요청정보 추출
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));	
		String method = request.getParameter("method");
		
		//2. 비즈니스메소드 호출
		Calc obj = new Calc();
		int result = obj.calc(method, num1, num2);
		
		//3. 결과화면
		out.print("<h2>계산결과("+method+"연산적용)</h2>");
		out.print("<hr/>");
		out.print("<h2>num1의 "+num1+"과 num2의 "+num2+"을 연산한 결과는 "+result+"입니다");
		
		
	}	
}
	
	


		
		
	

package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet{
	public LifeCycleServlet() {
		System.out.println("LifeCycleServlet객체 생성~~~");
	}
	public void init() {
		System.out.println("init()..호출");
	}
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		System.out.println("service()..호출===========>"+req.getMethod());
		if(req.getMethod().equals("GET")) {
			doGet(req, res);
		}else {
			doPost(req, res);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()..호출");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost()..호출");
	}
	public void destroy() {
		System.out.println("destroy()..^^호출");
	}
}

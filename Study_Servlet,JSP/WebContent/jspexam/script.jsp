<%@page import="member.MemberDTO"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Random,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>JSP에서 사용하는 스크립트요소</h2>
		<h3>4. 선언문</h3>
		<% int i = 1000; %>
		<%! int i = 2000; %>
		<%!
			public void test(){
			System.out.print("test"); // 절대 이렇게 사용하면 안됨.
			}
		
		%>
		
		
		<h3>3. 표현식</h3>
		<% String str2 = "java programming"; %>
		<h3>표현식으로 작성하는 문자열의 길이 : <%= str2.length() %></h3>
		<h4><%=10 %></h4>
		<h4><%=10.5 %></h4>
		<h4><%="java" %></h4>
		<h4><%=true %></h4>
		<h4><%=10/4 %></h4>
		<h4><%=new Date().toString() %></h4>
		<h4><%=str2 %></h4>
		<h4><%=str2.charAt(5) %></h4>
		
		
		
		
		
		
		
		<h3>2. 스크립트릿 - 자바코드를 쓸 수 있는 스크립트 요소</h3>
		<%
	      //자바 명령문을 정의할 수 있는 구성요소로 자바코드이므로 문장의 끝에 ;을 추가해야 한다.
	      //기본으로 인식하는 패키지는 java.lang패키지
	      //모두 import해야 한다.
		  String str = new String("자바");
		  out.print("<h3>문자열의 길이 : "+str.length()+"</h3>");
		  Random rand = null;
		  ArrayList list = null;
		  Date d = null;
		  MemberDTO dto = null;
		%>
		
		
		
		<h3>1. 주석문</h3>
		<!-- html주석문(클라이언트로 전송)  -->
		<%-- JSP주석문(클라이언트로 전송되지 않는다.) --%>
		<%
			// 자바주석문(클라이언트로 전송되지 않는다.)
			/*
			자바 여러 줄 주석문(클라이언트로 전송되지 않는다.)
			*/
		
		%>
	</body>
</html>
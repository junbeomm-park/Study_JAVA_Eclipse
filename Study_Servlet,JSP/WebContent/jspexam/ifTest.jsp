<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% 
		   //html태그와 스크립트요소를 같이 사용할 수 있다.
		   String str = "java~~~~~~~~";
		   int size = str.length();
		%>
		<h1>스크립트요소(스크립트릿, 표현식, 태그를 함께 사용하기)</h1>
		<% if(size>=5){ %>
			<h1>좋아요:<%= size %></h1>
			<img alt="test" src="/serverweb/images/m_garden01.jpg" width="500" height="500">
		<% }else{ %>
			<h1>싫어요:<%= size %></h1>
			<img alt="test" src="/serverweb/images/jang1.jpg" width="500" height="500">
		<% } %>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Dashboard</h1>
<%
String user=(String)session.getAttribute("name");
%><h1>Welcome<%=user %></h1>
<%
if((String)request.getParameter("msg")!=null){
	String msg = (String) request.getParameter("msg");	
%><h4 style="color:red"><%=msg %></h4>
<% 
}
%>
<a href="update">UpdateData</a>
</body>
</html>
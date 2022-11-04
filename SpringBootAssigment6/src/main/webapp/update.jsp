<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Update Data</h1>
<%
String user=(String)session.getAttribute("username");
%><h1>UserName<%= user %></h1>
<form action="update" method="post">
UserName:<input name="email" type="email" placeholder="E-mail"/><br><br>
MobileNo:<input name="mobileNo" type="text" placeholder="Mobile No"/><br><br>
<input type="submit" value="Update" />
</form>
<%
		if ((String) request.getParameter("msg") != null) {
			String msg = (String) request.getParameter("msg");
		%><h4  style="color: red"><%=msg%></h4>
		<%
		}
		%> 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Facebook</title>
</head>
<body>
<h2>Asif</h2>

<%
		if ((String) request.getParameter("msg") != null) {
			String msg = (String) request.getParameter("msg");
		%><h4  style="color: red"><%=msg%></h4>
		<%
		}
		%>
<div>
<a href="login">Login</a>
</div>
<div>
<a href="register">register</a>
</div>
</body>
</html>

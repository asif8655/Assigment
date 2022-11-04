<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%
if((String)request.getParameter("errormsg")!=null){
	String msg = (String) request.getParameter("errormsg");	
%><h4 style="color:red"><%=msg %></h4>
<% 
}
%>

<h1>Login</h1>
<form action="login" method="post">
UserName:<input name="username" type="text" placeholder="UserName" required/><span style="color:red;padding-left:5px">*</span><br><br>
Password:<input name="password" type="password" placeholder="Password" required/><span style="color:red;padding-left:5px">*</span><br><br>
<input type="submit" value="Submit" />
</form>
</body>
</html>
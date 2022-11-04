<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<form action="register" method="post">
			UserName:<input name="userName" type="text" placeholder="UserName" required /><span
			style="color: red; padding-left: 5px">*</span><br><br>
			Password:  <input name="password" type="password"
			placeholder="Password" required /><span
			style="color: red; padding-left: 5px">*</span><br><br>
			Name:<input name ="name" type ="text" placeholder="Name" required/><span
			style="color: red; padding-left: 5px">*</span><br><br>
			Email:<input name="email" type="email" placeholder="E-mail"
			required /><span style="color: red; padding-left: 5px">*</span><br><br>
			MobileNo:<input name="mobileNo" type="text" placeholder="MobileNo" required/><span
			style="color: red; padding-left: 5px">*</span><br><br>
			Country:<input name="country" type="text" placeholder="Country" required/><span
			style="color: red; padding-left: 5px">*</span><br><br>
			
		
			
		<br> <input type="submit" value="submit" />
		
		
		
		 <%
		if ((String) request.getParameter("error") != null) {
			String msg = (String) request.getParameter("error");
		%><h4  style="color: red"><%=msg%></h4>
		<%
		}
		%> 
	</form>
</body>
</html>
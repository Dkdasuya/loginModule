<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");


	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
		
	}
	
%>
welcome${username }<br>
<a href="videos.jsp" >Click here to go to videos page</a>
<br>
<br>
<a href="aboutUs.jsp">About us</a>

<br>
<form action="logout">
<button type="submit"> logout</button>
</form>

</body>
</html>
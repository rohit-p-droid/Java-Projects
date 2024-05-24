<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	
	<h><center>
		<form action="cngUpdate" method="post">
			<label>Enter the amount of CNG in kg :</label><br><br>
			<input type="text" placeholder="CNG in kg" name="amt">
			<input type="hidden" name="pid" value="<%=request.getParameter("id")%>">
			<%
				String id = request.getParameter("id");
			%>
			<%= id%>
			<br><br>
			<button type="submit">Update</button>
		
		</form>
	
	
	</center>
	
</body>
</html>
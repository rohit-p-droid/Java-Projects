<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employees</title>
</head>
<body>

<%@ page import = "java.sql.*" %>
<%@ page import = "com.project01.*" %>

<% 
	Connection con = Db.connect();
	String query = "select * from empreg";
	PreparedStatement pst = con.prepareStatement(query);
	ResultSet rs = pst.executeQuery();
%>

	<table width=100% border="1">
		<tr>
			<th>Employee id</th>
			<th>Employee Name</th>
			<th>Email</th>
			<th>Contact</th>
			<th>Emergency Contact</th>
			<th>Department</th>
		</tr>
		
		<% while(rs.next()){ %>
		
		<tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6)%></td>
			<td><a href = "delet.jsp?id=<%=rs.getInt(1)%>">Delete</a></td>
		</tr>
		
		<%} %>
	</table>
	
</body>
</html>
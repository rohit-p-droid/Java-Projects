<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
		body{
			background-image : url("images2/deposit.jpg")
		
		}
</style>

<title>Insert title here</title>
</head>
<body>

<%@ page import = "java.sql.*" %>
<%@ page import = "com.banking.Db" %>

<%
	Connection con = Db.connect();
	String query = "select * from account_sevlet";
	PreparedStatement pst = con.prepareStatement(query);
	ResultSet rs = pst.executeQuery();
%>


<center>
<table color="white" style="width:100%" border = "1">
	<tr>
		<th>Account No.</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Account Balance</th>
		<th>Email</th>
		<th>Password</th>
		<th>City</th>
		<th>Delete Account</th>
	</tr>
<%
while(rs.next()){
%>

	<tr>
		<td><%= rs.getInt(1) %></td>
		<td><%= rs.getString(2) %></td>
		<td><%= rs.getString(3) %></td>
		<td><%= rs.getInt(4) %></td>
		<td><%= rs.getString(5) %></td>
		<td><%= rs.getString(6) %></td>
		<td><%= rs.getString(7) %></td>
		<td><a href ="delete.jsp?id=<%= rs.getInt(1) %>">delete</a></td>
	</tr>
<%} %>


</table>
</center>

</body>
</html>
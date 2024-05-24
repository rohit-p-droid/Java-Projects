<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@ page import = "java.sql.*" %>
<%@ page import = "com.banking.Db" %>
<%@ page import = "com.banking.Val" %>

<%
	int id = Val.getAccNo();
	Connection con = Db.connect();
	String query = "select * from account_sevlet where accNO = ?";
	PreparedStatement pst = con.prepareStatement(query);
	pst.setInt(1, id);
	ResultSet rs = pst.executeQuery();
%>

<%while(rs.next()) {%>
<center>
<p>
<h3>Account Number</h3>
<%= rs.getInt(1)%> <b>
<h3>First Name</h3>
<%= rs.getString(2)%><b>
<h3>Last Name</h3>
<%= rs.getString(3)%><b>
<h3>Email</h3>
<%= rs.getString(5)%><b>
<h3>City</h3>
<%= rs.getString(7)%><b>
<h3>Balance</h3>
<%= rs.getInt(4)%><b>
<h3>Password</h3>
<%= rs.getString(4)%>


</p>
</center>
<%} %>

</body>
</html>
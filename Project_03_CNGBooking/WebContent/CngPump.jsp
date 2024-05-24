<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ page import="java.sql.*" %>
	<%@ page import="CNG.Db" %>
	
	<%
		int id = Db.getPumpId();
		Connection con = Db.connect();
		String query = "select * from pump_registration where id = ?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		
	%>
	<% while(rs.next()){%>

		<h2>Pump Id :</h2><p><%= rs.getInt(1) %></p>
		<h2>Pump Name :</h2><p><%= rs.getString(2) %></p>
		<h2>Address :</h2><p><%= rs.getString(3) %></p>
		<h2>City :</h2><p><%= rs.getString(4) %></p>
		<h2>Taluka :</h2><p><%= rs.getString(5) %></p>
		<h2>District :</h2><p><%= rs.getString(6) %></p>
		<h2>Open Time :</h2><p><%= rs.getString(7) %></p>
		<h2>Close Time :</h2><p><%= rs.getString(8) %></p>
		<h2>Mobile Number :</h2><p><%= rs.getString(9) %></p>
		<h2>Latitude :</h2><p><%= rs.getString(10) %></p>	
		<h2>Longitude :</h2><p><%= rs.getString(11) %></p>
		<h2>CNG in kg :</h2><p><%= rs.getInt(12) %></p>
		<h2>Status :</h2><p><%= rs.getString(14)%></p>
	
	
	
<h2><a href="updateCng.jsp?id=<%= rs.getInt(1)%>">Update CNG</a></h2>
<h2><a href="pumpViewAllCng.jsp">View All CNG pumps</a></h2>

<%} %>

</body>
</html>
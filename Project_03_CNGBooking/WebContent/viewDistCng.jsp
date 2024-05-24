<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All CNG Pumps</title>
</head>
<body>


	<%@ page import="java.sql.*" %>
	<%@ page import="CNG.Db" %>
	<center>
	<br>
	<select class="nav-link active" onchange="location = this.value;">
	    <option >View CNG Pumps</option>
	    <option value="viewAllCng.jsp">View All</option>
	    <option value="viewDistCng.jsp">View in District</option>
	    <option value="viewTalCng.jsp">View in Taluka</option>
	    <option value="viewCityCng.jsp">View in City</option>
	  </select>
	  <br><br>
	  <form action="viewDistCng.jsp">
	  <label>Enter District :</label>
	  <input type="text" placeholder="District" name="dist"><br><br>
	  <button type="submit">Submit</button>
	  </form>
	  <br><br>
	</center>
	<%
		Connection con = Db.connect();
		String dist = request.getParameter("dist");
		String query = "select * from pump_registration where dist = ?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, dist);
		ResultSet rs = pst.executeQuery();
	%>
	<center>
	
	<h1>All CNG Pumps</h1>
	<table border="1">
	<tr>
		<th>Pump Id</th>
		<th>Pump Name</th>
		<th>Address</th>
		<th>City</th>
		<th>Taluka</th>
		<th>District</th>
		<th>Open Time</th>
		<th>Close Time</th>
		<th>Mobile Number</th>
		<th>Latitude</th>
		<th>Longitude</th>
		<th>CNG in kg</th>
		<th>Status</th>
	</tr>
	
	<% while(rs.next()){%>
	<tr>
		<td><%= rs.getInt(1) %></td>
		<td><%= rs.getString(2) %></td>
		<td><%= rs.getString(3) %></td>
		<td><%= rs.getString(4) %></td>
		<td><%= rs.getString(5) %></td>
		<td><%= rs.getString(6) %></td>
		<td><%= rs.getString(7) %></td>
		<td><%= rs.getString(8) %></td>
		<td><%= rs.getString(9) %></td>
		<td><%= rs.getString(10) %></td>
		<td><%= rs.getString(11) %></td>
		<td><%= rs.getInt(12) %></td>
		<td><%= rs.getString(14)%></td>
		<td><a href = "approve.jsp?id=<%= rs.getInt(1)%>">Approve</a></td>
		<td><a href = "pumpDelete.jsp?id=<%= rs.getInt(1)%>">Delete</a></td>
		
	</tr>
	<%} %>
	</table>
	</center>

</body>
</html>
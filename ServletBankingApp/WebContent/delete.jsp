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

<%
	Connection con = Db.connect();
	int id = Integer.parseInt(request.getParameter("id"));
	String query = "delete from account_sevlet where accNO = ?";
	PreparedStatement pst = con.prepareStatement(query);
	pst.setInt(1, id);
	int i = pst.executeUpdate();
	if(i > 0)
	{
		response.sendRedirect("viewAccount.jsp");
	}
%>
	
%>

</body>
</html>
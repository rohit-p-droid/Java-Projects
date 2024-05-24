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
<%@ page import = "com.project01.*" %>

<% 
	Connection con = Db.connect();
	int eid = Integer.parseInt(request.getParameter("id"));
	String query = "delete from empreg where eid = ?";
	PreparedStatement pst = con.prepareStatement(query);
	pst.setInt(1, eid);
	int i = pst.executeUpdate();
	if(i > 0){
		response.sendRedirect("viewEmp.jsp");
	}
	else{
		response.sendRedirect("viewEmp.jsp");
	}
	
	
%>


</body>
</html>
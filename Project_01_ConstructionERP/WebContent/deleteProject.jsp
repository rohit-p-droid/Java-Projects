<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete project</title>
</head>
<body>

<%@ page import = "java.sql.*" %>
<%@ page import = "com.project01.*" %>

<%
	Connection con = Db.connect();
	int pid = Integer.parseInt(request.getParameter("prid"));
	String query1 = "delete from projects where prid = ?";
	PreparedStatement pst = con.prepareStatement(query1);
	pst.setInt(1, pid);
	int j = pst.executeUpdate();
	if(j > 0){
		response.sendRedirect("viewProject.jsp");
	}
	else{
		response.sendRedirect("viewProject.jsp");
	}

%>

</body>
</html>
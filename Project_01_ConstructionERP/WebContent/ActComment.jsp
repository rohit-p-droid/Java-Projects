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


	String name = "Rohit Patil";
	Connection con = Db.connect();
	int pid = Integer.parseInt(request.getParameter("pid"));
	String comment = "\n"+name + ":\n" +request.getParameter("comment");
	String query = "update projects set comment = ? where prid = ?";
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1, comment);
	pst.setInt(2, pid);
	int i = pst.executeUpdate();
	
	if(i>0){
		response.sendRedirect("index.html");
	}
%>     

</body>
</html>
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
<%@ page import="java.io.*" %>
<%@ page import = "com.project01.Db" %>


<%	
	Connection con = Db.connect();
	String name = request.getParameter("name");
	PreparedStatement pst = con.prepareStatement("select * from projects where pname = ?");
	pst.setString(1,name);
	ResultSet rs = pst.executeQuery();
	
	while(rs.next())
	{
		Blob blob = rs.getBlob("image");
		byte byteArray[] = blob.getBytes(1,(int)blob.length());
		response.setContentType("image/png");
		OutputStream os = response.getOutputStream();
		os.write(byteArray);
		os.flush();
		os.close();
	}
%>

	
</body>
</html>
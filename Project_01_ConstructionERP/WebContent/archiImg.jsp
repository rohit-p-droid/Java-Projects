<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h><center>
	<form action = "AddImg" enctype="multipart/form-data" method="post">
		<p>Add image</p>
		<input type="text" class="form-control1" id="exampleInputPassword1" placeholder="project Id" name="pid">
		<input type = "file" name = "image"><br><br>
		<button type = "submit">submit</button>
	</form>
	</center>
	

</body>
</html>
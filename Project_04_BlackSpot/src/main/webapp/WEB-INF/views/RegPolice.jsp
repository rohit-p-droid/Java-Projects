<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Police Station Registration</title>
</head>
<body>
	<center>
			<form action="stationReg" method="post">
				<input type="hidden" name="pid" value="0">
				<label>Police Station Name :</label>
				<input type="text" name="pname"><br><br>
				<label>Police Station Address :</label>
				<input type="text" name="paddr"><br><br>
				<label>Police Station Contact :</label>
				<input type="text" name="pcontact"><br><br>
				<label>Police Station Email :</label>
				<input type="text" name="pmail"><br><br>
				<label>Police Station Password :</label>
				<input type="password" name="ppass"><br><br>
				<button type="submit">Submit</button>
			</form>
	
	</center>

</body>
</html>
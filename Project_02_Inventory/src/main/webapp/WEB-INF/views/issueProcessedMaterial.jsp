<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Dashboard</title>
  </head>
  <body>
    
    	
    		
	<br><br>
<center>	<h2 class="card-title">Issue Processed Material Quantity</h2></center>
    <form action="IssueProcessedMaterial" method="post">
    	<br><br>
		  	<center>
		  	<div class="form">
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Issuer Name</label>
		     <center> <input type="text" name="PissuerName" class="form-control" id="inputAddress" placeholder="Issuer name"></center>
		    </div>
		    <input type="hidden" name="pIid" value="0">
		    <input type="hidden" name="PitemId" value="<%=request.getParameter("pid")%>" >
		<input type="hidden" name="Pname" value="<%=request.getParameter("Pname")%>">
		<input type="hidden" name="Pcost" value="<%=request.getParameter("cost")%>">
		<input type="hidden" name="Punit" value="<%=request.getParameter("unit")%>"> 
		  </div>
		 <div class="form">
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Quntity</label>
		     <center> <input type="text" name="Pquantity" class="form-control" id="inputAddress" placeholder="Quantity"></center>
		     <input type="hidden" name="id" value="<%=request.getParameter("id")%>" >
		    </div>
		  </div>
		  <div class="form">
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Date</label>
		     <center> <input type="date" name="Pdate" class="form-control" id="inputAddress" placeholder="date"></center>
		    </div>
		   
		  </div>
		  </center>
		  <center><button type="submit" class="btn btn-primary">Issue Raw Material</button></center>
		</form>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
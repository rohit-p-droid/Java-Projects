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
    	<div class="container">
    	
    		<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-pills card-header-pills">
      <li class="nav-item">
	<select class="nav-link active" onchange="location = this.value;">
	    <option value="volvo" type="hidded">Add Material</option>
	    <option value="addRawMaterial">Add Raw Material</option>
	    <option value="addProcessedMaterial">Add Processed Material</option>
	  </select>
      </li>
      <li class="nav-item">
        <select class="nav-link active" onchange="location = this.value;">
	    <option value="volvo">View Material</option>
	    <option value="viewRawMaterial">View Raw Material</option>
	    <option value="viewProcessedMaterial">View Processed Material</option>
	  </select>
      </li>
      <li class="nav-item">
        <select class="nav-link active" onchange="location = this.value;">
	    <option value="volvo">Logs</option>
	    <option value="viewIssuerRawMaterialLog">Raw Material</option>
	    <option value="issueProcessedMaterialLog">Processed Material</option>
	  </select>
      <li class="nav-item">
        <select class="nav-link active" onchange="location = this.value;">
	    <option value="volvo">Unavailable Materials</option>
	    <option value="UnavailableRawMaterial">Raw Material</option>
	    <option value="UnavailableProcessedMaterial">Processed Material</option>
	  </select>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login">Log out</a>
      </li>
    </ul>
  </div>
  </div>
</div>
	<br><br>
	<center>	<h2 class="card-title">Add Raw Material</h2>
    
    	<br><br>
		<form action="AddRawMaterial" method="post">
		  <div class="form-row">
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Product ID</label>
		      <input type="text" name="id" class="form-control" id="inputAddress" placeholder="Product ID">
		    </div>
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Product Name</label>
		      <input type="text" name="name" class="form-control" id="inputAddress" placeholder="Product Name">
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Quantity</label>
		      <input type="text" name="quantity" class="form-control" id="inputAddress" placeholder="Quantity">
		    </div>
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Unit</label>
		      <input type="text" name="unit" class="form-control" id="inputAddress" placeholder="Unit (pcs, kg, liters)">
		    </div>
		  </div>
		  
		 <div class="form-row">
		    <div class="form-group col-md-5">
		      <label for="inputAddress">Cost per unit</label>
		      <input type="text" name="cost" class="form-control" id="inputAddress" placeholder="Cost per unit">
		    </div>
		   
		  </div>
		  <button type="submit" class="btn btn-primary">Add Raw Material</button>
		</form>
</center>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
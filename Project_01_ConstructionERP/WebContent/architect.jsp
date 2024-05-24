
<!DOCTYPE HTML>
<html>
<head>
<title>Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="css/lines.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="js/jquery.min.js"></script>
<!----webfonts--->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
<!---//webfonts--->  
<!-- Nav CSS -->
<link href="css/custom.css" rel="stylesheet">
<!-- Metis Menu Plugin JavaScript -->
<script src="js/metisMenu.min.js"></script>
<script src="js/custom.js"></script>
<!-- Graph JavaScript -->
<script src="js/d3.v3.js"></script>
<script src="js/rickshaw.js"></script>
</head>
<body>
<div id="wrapper">
     <!-- Navigation -->
        <nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
            </div>
            <!-- /.navbar-header -->
            <ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>Messages</strong>
							<div class="progress thin">
							  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
							    
							  </div>
							</div>
						</li>
						
	        		</ul>
	      		</li>
			    
						</li>
						
	        		</ul>
	      		</li>
			</ul>
			<form class="navbar-form navbar-right">
          
            </form>
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="index.html"><i class="fa fa-dashboard fa-fw nav_icon"></i>Dashboard</a>
                        </li>
                        <li>
                            <a href="AdLogin.html"><i class="fa fa-laptop nav_icon"></i>Admin Login<span ></span></a>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="architectLogin.html"><i class="fa fa-indent nav_icon"></i>Architect Login<span ></span></a>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="DptLogin.html"><i class="fa fa-envelope nav_icon"></i>Department Login<span ></span></a>
                            <!-- /.nav-second-level -->
                        </li>
                       
                     </ul>
                        
                           
            <!-- /.navbar-static-side -->
        </nav>
        <div id="page-wrapper">
        <div class="graphs">
     	<div class="col_3">
        	<!-- COde here from sasdfjaslk;dfjalsdfjlasdfja -->
        	

 <%@ page import = "java.sql.*" %>
<%@ page import = "com.project01.*" %>

<% 
	Connection con = Db.connect();
	String arId = values.getArchiName();
	String query = "select * from projects where pemp = ?";
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1, arId);
	ResultSet rs = pst.executeQuery();
	int i = 0;
%>
      
    <div class="table-responsive">
      <table class="table table-bordered">
        <thead>
          <tr>
          	<th>Sr. No.</th>
            <th>Project id</th>
			<th>Project Name</th>
			<th>Department</th>
			<th>Architect</th>
			<th>Department Task</th>
			<th>Architect Task</th>
			<th>Address</th>
          </tr>
        </thead>
        
        <% while(rs.next()){ %>
        <% i = i + 1; %>
        <tbody>
          <tr>
            <td><%=i%></td>
            <td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6)%></td>
			<td><%=rs.getString(7)%></td>
			<td><a href ="archiImg.jsp?pid=<%= rs.getInt(1)%>">add image</a></td>
			<td><a href="viewImg.jsp?name=<%= rs.getString(2)%>">view img</a>
			<td><a href = "archiCom.jsp">comment</a></td>
			<td><a href = "viewCom.jsp?pname=<%= rs.getString(2)%>">View comment</a></td>
			
          </tr>
          <%} %>
        </tbody>
      </table>
			
            



<p>Copyright &copy; 2022 All Rights Reserved | Design by Rohit Patil</p>
	    
</body>
</html>

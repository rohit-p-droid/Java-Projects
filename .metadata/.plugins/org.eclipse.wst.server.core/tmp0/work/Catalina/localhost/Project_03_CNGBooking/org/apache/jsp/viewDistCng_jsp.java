/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2022-11-07 15:54:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import CNG.Db;

public final class viewDistCng_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>All CNG Pumps</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<select class=\"nav-link active\" onchange=\"location = this.value;\">\r\n");
      out.write("\t    <option >View CNG Pumps</option>\r\n");
      out.write("\t    <option value=\"viewAllCng.jsp\">View All</option>\r\n");
      out.write("\t    <option value=\"viewDistCng.jsp\">View in District</option>\r\n");
      out.write("\t    <option value=\"viewTalCng.jsp\">View in Taluka</option>\r\n");
      out.write("\t    <option value=\"viewCityCng.jsp\">View in City</option>\r\n");
      out.write("\t  </select>\r\n");
      out.write("\t  <br><br>\r\n");
      out.write("\t  <form action=\"viewDistCng.jsp\">\r\n");
      out.write("\t  <label>Enter District :</label>\r\n");
      out.write("\t  <input type=\"text\" placeholder=\"District\" name=\"dist\"><br><br>\r\n");
      out.write("\t  <button type=\"submit\">Submit</button>\r\n");
      out.write("\t  </form>\r\n");
      out.write("\t  <br><br>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t");

		Connection con = Db.connect();
		String dist = request.getParameter("dist");
		String query = "select * from pump_registration where dist = ?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, dist);
		ResultSet rs = pst.executeQuery();
	
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>All CNG Pumps</h1>\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>Pump Id</th>\r\n");
      out.write("\t\t<th>Pump Name</th>\r\n");
      out.write("\t\t<th>Address</th>\r\n");
      out.write("\t\t<th>City</th>\r\n");
      out.write("\t\t<th>Taluka</th>\r\n");
      out.write("\t\t<th>District</th>\r\n");
      out.write("\t\t<th>Open Time</th>\r\n");
      out.write("\t\t<th>Close Time</th>\r\n");
      out.write("\t\t<th>Mobile Number</th>\r\n");
      out.write("\t\t<th>Latitude</th>\r\n");
      out.write("\t\t<th>Longitude</th>\r\n");
      out.write("\t\t<th>CNG in kg</th>\r\n");
      out.write("\t\t<th>Status</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t");
 while(rs.next()){
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getInt(1) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(3) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(4) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(5) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(6) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(7) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(8) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(9) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(10) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(11) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getInt(12) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( rs.getString(14));
      out.write("</td>\r\n");
      out.write("\t\t<td><a href = \"approve.jsp?id=");
      out.print( rs.getInt(1));
      out.write("\">Approve</a></td>\r\n");
      out.write("\t\t<td><a href = \"pumpDelete.jsp?id=");
      out.print( rs.getInt(1));
      out.write("\">Delete</a></td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

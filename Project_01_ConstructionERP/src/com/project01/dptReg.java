package com.project01;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dptReg
 */
public class dptReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dptReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Connection con = Db.connect();
		int did = 0;
		String task = null;
		String dname = request.getParameter("dname");
		String demail = request.getParameter("demail");
		String dcontact = request.getParameter("dcontact");
		String daddr = request.getParameter("daddr");
		String dpass = request.getParameter("dpassword");
		
		try {
			
			String query = "insert into department values(?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, did);
			pst.setString(2, dname);
			pst.setString(3, demail);
			pst.setString(4, dcontact);
			pst.setString(5, daddr);
			pst.setString(6, dpass);
			pst.setString(7, task);
			
			int i = pst.executeUpdate();
			if(i > 0){
				response.sendRedirect("admin.html");
			}
			else{
				response.sendRedirect("addDpt.html");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

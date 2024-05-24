package com.project01;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empReg
 */
public class empReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public empReg() {
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
		
		int eid = 0;
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String Econtact = request.getParameter("Econtact");
		String dept = request.getParameter("dept");
		String pass = request.getParameter("password");
		
		Connection con = Db.connect();
		
		
		try {
			
			String query = "insert into empreg values(?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, eid);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, contact);
			pst.setString(5, Econtact);
			pst.setString(6, dept);
			pst.setString(7, pass);
			int i = pst.executeUpdate();
			if(i > 0)
			{
				response.sendRedirect("index.html");
			}
			else
			{
				response.sendRedirect("addEmp.html");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

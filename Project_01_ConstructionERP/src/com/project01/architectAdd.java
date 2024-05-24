package com.project01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class architectAdd
 */
public class architectAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public architectAdd() {
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
		

		int aid = 0;
		String name = request.getParameter("aname");
		String email = request.getParameter("aemail");
		String dept = request.getParameter("adept");
		String pass = request.getParameter("apassword");
		String task = null;
		
		Connection con = Db.connect();
		
		
		try {
			
			String query = "insert into architect values(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, aid);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, dept);
			pst.setString(5, pass);
			pst.setString(6, task);
			int i = pst.executeUpdate();
			if(i > 0)
			{
				response.sendRedirect("admin.html");
			}
			else
			{
				response.sendRedirect("architectReg.html");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

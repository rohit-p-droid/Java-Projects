package com.project01;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjectReg
 */
public class ProjectReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectReg() {
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
		int id = 0;
		String pname = request.getParameter("prname");
		String addr = request.getParameter("paddr");
		
		try {
			String query = "insert into projects (prid,pname,paddr)values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);	
			pst.setString(2, pname);
			pst.setString(3, addr);
			int i = pst.executeUpdate();
			if(i > 0)
			{
				response.sendRedirect("admin.html");
			}
			else
			{
				response.sendRedirect("addProject.html");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

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
 * Servlet implementation class editProject
 */
public class editProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editProject() {
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
		String dpt = request.getParameter("pdpt");
		String dptTask = request.getParameter("dpttask");
		String archiId = request.getParameter("arId");
		String archiTask = request.getParameter("architask");
		int prid = values.getPrId();
		
		try {
			String query = "update projects set pdpt = ?, pemp = ?, dtask = ?, etask = ? where prid = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, dpt);	
			pst.setString(2, archiId);
			pst.setString(3, dptTask);
			pst.setString(4, archiTask);
			pst.setInt(5, prid);
			
			int i = pst.executeUpdate();
			if(i > 0)
			{
				response.sendRedirect("viewProject.jsp");
			}
			else
			{
				response.sendRedirect("editProject.jsp");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

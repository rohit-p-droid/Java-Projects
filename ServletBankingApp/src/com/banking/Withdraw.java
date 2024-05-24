package com.banking;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Withdraw
 */
public class Withdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Withdraw() {
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
		
		int accNo = Val.getAccNo();
		int amt = Integer.parseInt(request.getParameter("amt"));
		String pass = request.getParameter("passwd");
		int preAmt = 0, newAmt = 0;
		
		Connection con = Db.connect();
		
		try {
			String query = "select * from account_sevlet where accNo = ? and passwd = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, accNo);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				preAmt = rs.getInt(4);
			}
			newAmt = preAmt - amt;
			
			String query1 = "update account_sevlet set balance = ? where accNo = ? and passwd = ?";
			PreparedStatement pst1 = con.prepareStatement(query1);
			pst1.setInt(1, newAmt);
			pst1.setInt(2, accNo);
			pst1.setString(3, pass);
			int i = pst1.executeUpdate();
			if(i > 0)
			{
				response.sendRedirect("user.html");
			}
			else
			{
				response.sendRedirect("withdraw.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

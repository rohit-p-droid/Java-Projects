package com.banking;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Transfer
 */
public class Transfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transfer() {
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
		int acc2 = Integer.parseInt(request.getParameter("acc"));
		String pass = request.getParameter("passwd");
		int preAmt = 0, newAmt = 0;
		
		Connection con = Db.connect();

		try {
			//debit
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
			pst1.executeUpdate();
			
			//credit
			String query2 = "select * from account_sevlet where accNo = ?";
			PreparedStatement pst2 = con.prepareStatement(query2);
			pst2.setInt(1, acc2);
			ResultSet rs1 = pst2.executeQuery();
			while(rs1.next())
			{
				preAmt = rs1.getInt(4);
			}
			newAmt = amt + preAmt;
			String query3 = "update account_sevlet set balance = ? where accNo = ?";
			PreparedStatement pst3 = con.prepareStatement(query3);
			pst3.setInt(1, newAmt);
			pst3.setInt(2, acc2);
			int i = pst3.executeUpdate();
			if(i > 0){
				response.sendRedirect("user.html");
			}
			else{
				response.sendRedirect("Transfer.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}

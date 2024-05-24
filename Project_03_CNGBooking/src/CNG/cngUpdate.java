package CNG;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cngUpdate
 */
public class cngUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cngUpdate() {
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
		
		int amt = Integer.parseInt(request.getParameter("amt"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		int preAmt = 0, newAmt = 0;
		
		Connection con = Db.connect();
		
		try {
			String query1 = "select * from pump_registration where id = ?";
			PreparedStatement pst1 = con.prepareStatement(query1);
			pst1.setInt(1, pid);
			ResultSet rs = pst1.executeQuery();
			
			while(rs.next())
			{
				preAmt = rs.getInt(12);
			}
			
			newAmt = amt + preAmt;
			
			String query2 = "update pump_registration set cng = ? where id = ?";
			PreparedStatement pst2 = con.prepareStatement(query2);
			pst2.setInt(1, newAmt);
			pst2.setInt(2, pid);
			int i = pst2.executeUpdate();
			
			if(i > 0)
				response.sendRedirect("CngPump.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

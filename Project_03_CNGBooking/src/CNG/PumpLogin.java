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
 * Servlet implementation class PumpLogin
 */
public class PumpLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PumpLogin() {
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
		
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");
		String status = "Approved";
		
		Connection con = Db.connect();
		
		
		try {
			String query = "select * from pump_registration where mobile = ? and passwd = ? and status = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, mobile);
			pst.setString(2, pass);
			pst.setString(3, status);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				Db.setPumpId(rs.getInt(1));
				response.sendRedirect("CngPump.jsp");
			}
			else
			{
				response.sendRedirect("pumpLogin.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

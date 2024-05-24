package CNG;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegUser
 */
public class RegUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegUser() {
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
		
		int uid = 0;
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");
		
		String query = "insert into users values(?,?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, uid);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, city);
			pst.setString(5, mobile);
			pst.setString(6, pass);
			int i = pst.executeUpdate();
			
			if(i>0)
				response.sendRedirect("userLogin.html");
			else
				response.sendRedirect("userReg.html");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

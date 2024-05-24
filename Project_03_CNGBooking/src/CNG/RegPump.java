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
 * Servlet implementation class RegPump
 */
public class RegPump extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegPump() {
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
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String city = request.getParameter("city");
		String taluka = request.getParameter("taluka");
		String dist = request.getParameter("dist");
		String otime = request.getParameter("otime");
		String ctime = request.getParameter("ctime");
		String mobile = request.getParameter("mobile");
		String ltd = request.getParameter("ltd");
		String lgtd = request.getParameter("lgtd");
		String status = "Pending";
		int cng = Integer.parseInt(request.getParameter("cng"));
		String pass = request.getParameter("pass");
		
		
		try {
			String query = "insert into pump_registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, addr);
			pst.setString(4, city);
			pst.setString(5, taluka);
			pst.setString(6, dist);
			pst.setString(7, otime);
			pst.setString(8, ctime);
			pst.setString(9, mobile);
			pst.setString(10, ltd);
			pst.setString(11, lgtd);
			pst.setInt(12, cng);
			pst.setString(13, pass);
			pst.setString(14, status);
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				response.sendRedirect("index.html");
			}
			else
			{
				response.sendRedirect("pumpReg.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package test;

import java.io.IOException;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class image
 * 
 */
@WebServlet(urlPatterns={"/uploadImage"})
@MultipartConfig(maxFileSize=16177216)

public class image extends HttpServlet {
	
	PrintWriter out;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public image() {
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
		response.setContentType("text/html;charset=UTF-8");
		out = response.getWriter();

		int result = 0;
		Part part = request.getPart("file");
		
		if(part!=null)
		{
			int id = Integer.parseInt(request.getParameter("id"));
			try {
				PreparedStatement pst = con.prepareStatement("insert into testimg values(?,?)");
				InputStream is = part.getInputStream();
				pst.setInt(1, id);
				pst.setBlob(2, is);
				result = pst.executeUpdate();
				
				if(result>0){
					response.sendRedirect("index.html");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}

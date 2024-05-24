
package com.project01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 * Servlet implementation class AddImg
 */
@WebServlet(urlPatterns={"/uploadImage"})
@MultipartConfig(maxFileSize=16177216)
public class AddImg extends HttpServlet {
	PrintWriter out;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddImg() {
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
		Part part = request.getPart("image");
		
		if(part!=null)
		{
			int id = Integer.parseInt(request.getParameter("pid"));
			try {
				PreparedStatement pst = con.prepareStatement("update projects set image = ? where prid = ?");
				InputStream is = part.getInputStream();
				pst.setBlob(1, is);
				pst.setInt(2, id);
				result = pst.executeUpdate();
				
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.DbUtil;


/**
 * Servlet implementation class addStudent
 */
@WebServlet("/add_section")
public class add_section extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_section() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int sectionNo=Integer.parseInt(request.getParameter("sectionNo"));
	     int attends=sectionNo;
	     HttpSession session=request.getSession();
	     String name=(String)session.getAttribute("name");
	     PrintWriter out=response.getWriter();
	    try {
	    	Connection conn=DbUtil.getConnection();
	    	PreparedStatement stmt=conn.prepareStatement("update student set attends=? where name=?",
	                ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	    	stmt.setInt(1, sectionNo);
	    	stmt.setString(2,name);
	    	stmt.executeUpdate();
			out.print("<script language='javascript'>alert('successfully!');window.location.href='MyWeb/index_right.html';</script>");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block		
			e.printStackTrace();
		    out.println("A failure!");
		}
	}
  
}

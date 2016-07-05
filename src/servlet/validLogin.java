package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Login;

/**
 * Servlet implementation class doLogin
 */  
@WebServlet("/validLogin")
public class validLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
        String name=request.getParameter("name");
        session.setAttribute("name", name);	
        String ssn=request.getParameter("ssn");
        session.setAttribute("ssn", ssn);
        String status=request.getParameter("status");
        Login valid=new Login();
        try {
        	if("student".equals(status)){
        		if(valid.doLogin(name, ssn)){
        			response.sendRedirect("MyWeb/studentIndex.html");
     			}
                    else{
                 	   response.sendRedirect("MyWeb/error.html");
                 
                    }	
        	}
        	if("professor".equals(status)){
        		if(valid.doLogin2(name, ssn)){
        			response.sendRedirect("MyWeb/professorIndex.html");
                   
     			}
                    else{
                 	   response.sendRedirect("MyWeb/error.html");
                    } 
        	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}

}

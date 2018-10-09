package com.abc;
/* made some changes to check git */
import java.io.IOException;
import java.io.PrintWriter;

import javaxyz.servletx.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		
		String suname = request.getParameter("uname");
		String spwd = request.getParameter("pwd");
		
		PrintWriter pw = response.getWriter();
		
		if(suname.equalsIgnoreCase("abcdef")&&spwd.equals("qrstuv"))
		{
			pw.println("<b>You are logged successfully</b>");
		}
		else
		{
			pw.println("<b>Invalid Username/Pwd. <a href=\"Login.html\">Try Again</a>");
		}
	
	}

}

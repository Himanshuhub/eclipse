package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HelloWorldServlet4")
public class HelloWorldServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String an = request.getParameter("an");
		String middlename = request.getParameter("mname");
		String lastname = request.getParameter("lname");
				
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> Hello World </title> </head> ");
		out.println("<body>");
		out.println("<font color = \"red\" size = 20> Account Number: </font>" + an);
		out.println("<font color = \"red\" size = 20> Middle Name: </font>" + middlename);
		out.println("<font color = \"red\" size = 20> Last Name: </font>" + lastname);
		out.println("</body>");
		out.println("</html>");

		HttpSession ses = request.getSession();
		ses.setAttribute("fn", firstname);
		ses.setAttribute("mn", middlename);
		ses.setAttribute("ln", lastname);
		
		
		response.sendRedirect("jsp/Welcome2Output2.jsp"); 
		
		
	}

}

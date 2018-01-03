package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet2")
public class HelloWorldServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstname = request.getParameter("fname");
		String middlename = request.getParameter("mname");
		String lastname = request.getParameter("lname");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> Hello World </title> </head> ");
		out.println("<body>");
		out.println("<font color = \"red\" size = 20> First Name: " + firstname);
		out.println("<font color = \"red\" size = 20> Middle Name: " + middlename);
		out.println("<font color = \"red\" size = 20> Last Name: " + lastname);
		out.println("</body>");
		out.println("</html>");
		
	}

}

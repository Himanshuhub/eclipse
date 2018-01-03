package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HelloWorldServlet3")
public class HelloWorldServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected boolean doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String firstname = request.getParameter("fname");
		String middlename = request.getParameter("mname");
		String lastname = request.getParameter("lname");
				
		// 2a: Validation
		String errors = "";
		if (isEmpty(firstname)) {
			errors += "First name can't be null <br/>";			
		}

		if (isEmpty(middlename)) {
			errors += "Middle name can't be null <br/>";			
		}

		if (isEmpty(lastname)) {
			errors += "Last name can't be null <br/>";			
		}
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> Hello World </title> </head> ");
		out.println("<body>");
		out.println("<font color = \"red\" size = 20> First Name: </font>" + firstname);
		out.println("<font color = \"red\" size = 20> Middle Name: </font>" + middlename);
		out.println("<font color = \"red\" size = 20> Last Name: </font>" + lastname);
		out.println("</body>");
		out.println("</html>");

		HttpSession ses = request.getSession();
		ses.setAttribute("fn", firstname);
		ses.setAttribute("mn", middlename);
		ses.setAttribute("ln", lastname);
		
		// Step 3: response back
		if (isEmpty(errors)) {
			HttpSession ses = request.getSession();
			ses.setAttribute("pinfo", personalInfo);
			response.sendRedirect("jsp/Welcome2Output.jsp"); 			
		} else {
			request.setAttribute(errorMessage, errors);
			RequestDispatcher rd = request.getRequestDispatcher("welcome.html")
					rd.forward(arg0, arg1);
			
		}
		
		response.sendRedirect("jsp/Welcome2Output.jsp"); 
		
		
	}

	private boolean isEmpty(String firstname) {
		// TODO Auto-generated method stub
		return firstname == null || firstname.trim().length() == 0;
	}

}

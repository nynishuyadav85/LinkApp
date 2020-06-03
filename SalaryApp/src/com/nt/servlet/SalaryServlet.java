package com.nt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SalaryServlet extends HttpServlet{

	@Override
public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		PrintWriter pw = null;
		String name = null;
		String gender = null;
		int age = 0;
		int salary = 0;
		
		pw = res.getWriter();
		res.setContentType("text/html");
		
		name = req.getParameter("pname");
		salary = Integer.parseInt(req.getParameter("psalary"));
		age = Integer.parseInt(req.getParameter("page"));
		
		if(salary>=5000 && age>=18) {
			pw.println("<h1 style='color:green;text-align:center'>" + name +   "You are elegible for opening account</h1>" );
			
		}
		else {
			pw.println("<h1 style='color:green;text-align:center'>" + name +   "You are not elegible for opening account  ok</h1>" );
		}
		pw.println("<a href='http://localhost:2030/SalaryApp/input.html'><img src ='home.png'></a>");
		pw.close();
		
		
			
	   }
	
	
	}
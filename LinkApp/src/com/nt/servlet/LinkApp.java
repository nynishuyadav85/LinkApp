package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkApp extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = null;
		String pval = null;
		Locale locales[] = null;
		
		pw = res.getWriter();
		res.setContentType("text/html");
		
		pval = req.getParameter("s1");
		locales=Locale.getAvailableLocales();
		
		
		if(pval.equalsIgnoreCase("link1")) {
			for (Locale l:locales) {
				pw.println(l.getDisplayCountry()+"<br>");
			}
		}  
		else if (pval.equalsIgnoreCase("link2")) {
			for (Locale l:locales) {
				pw.println(l.getDisplayLanguage()+"<br>");
		}
		    } 
		else {
			pw.println("<br>"+System.getProperties()+"<br>");
		
	}
		pw.println("<a href = 'link.html'><img src='images/home.png'></a>");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}

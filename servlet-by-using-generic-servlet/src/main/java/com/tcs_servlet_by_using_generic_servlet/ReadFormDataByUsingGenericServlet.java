package com.tcs_servlet_by_using_generic_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ReadFormDataByUsingGenericServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("data bantu sir");
				
		//read form data
		
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String address = req.getParameter("userAddress");
		String number = req.getParameter("number");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String place = req.getParameter("place");
		String town = req.getParameter("town");
		String district = req.getParameter("district");
		
		
		/*System.out.println(name);
		System.out.println(email);
		System.out.println(address);*/
		
		PrintWriter pw = res.getWriter();
		
		pw.print("<h1> Welcome :"+name+"</h1>");
		pw.print("<h1> Email :"+email+"</h1>");
		pw.print("<h1> Address :"+address+"</h1>");
		pw.print("<h1> number :"+number+"</h1>");
		pw.print("<h1> age :"+age+"</h1>");
		pw.print("<h1> gender :"+gender+"</h1>");
		pw.print("<h1> place :"+place+"</h1>");
		pw.print("<h1> town :"+town+"</h1>");
		pw.print("<h1> district :"+district+"</h1>");
		
	}

}

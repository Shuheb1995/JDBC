package com.xworkz.bankaccount;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/account" , initParams = {@WebInitParam(name="userName" , value="Musaib") , @WebInitParam(name="password" , value = "8747")})
public class BankAccountServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println(userName+"   "+password);
		
		String correctName = getInitParameter("userName");
		String correctPassword = getInitParameter("password");
		
		if(!userName.isEmpty() && !password.isEmpty()) {
			
			if(userName.equals(correctName) && password.equals(correctPassword)) {
				req.getRequestDispatcher("/LogIn.jsp").forward(req, resp);
			} else {
				resp.setContentType("text/html");
				PrintWriter writer = resp.getWriter();
				req.getRequestDispatcher("/AccountLogIn.jsp").include(req, resp);
				writer.println("Name or Password is incorrect");
			}
			}else {
				resp.setContentType("text/html");
				PrintWriter writer = resp.getWriter();
				req.getRequestDispatcher("/AccountLogIn.jsp").include(req, resp);
				writer.println("Name and Password cannot be empty");
			}
		}
		
		
	}



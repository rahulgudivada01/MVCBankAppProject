package com.digit.javaTraining.MVCApp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutController")
public class LogoutController extends HttpServlet {
	@Override
	public void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		HttpSession session=req.getSession();
		session.invalidate();
		
		resp.sendRedirect("Welcome.html");
		
	}

}

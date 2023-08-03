package com.digit.javaTraining.MVCApp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.javaTraining.MVCApp.model.BankApp;
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		BankApp bankapp=new BankApp();
		bankapp.setBank_id(Integer.parseInt(req.getParameter("bank_id")));
		bankapp.setBank_name(req.getParameter("bank_name"));
		bankapp.setIfsc_code(req.getParameter("ifsc_code"));
		bankapp.setAccno(Integer.parseInt(req.getParameter("accno")));
		bankapp.setPin(Integer.parseInt(req.getParameter("pin")));
		bankapp.setCust_id(Integer.parseInt(req.getParameter("cust_id")));
		bankapp.setCust_name(req.getParameter("cust_name"));
		bankapp.setBalance(Integer.parseInt(req.getParameter("balance")));
		bankapp.setEmail(req.getParameter("email"));
		bankapp.setPhone(Long.parseLong(req.getParameter("phone")));
		
		boolean b=bankapp.register();
		if(b==true)
		{
			resp.sendRedirect("RegisterSuccess.html");
		}
		else
		{
			resp.sendRedirect("RegisterFail.html");
		}
		
	}

}

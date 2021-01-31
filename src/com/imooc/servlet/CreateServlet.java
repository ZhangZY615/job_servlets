package com.imooc.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class CreateServlet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("creating DB");
	}

}

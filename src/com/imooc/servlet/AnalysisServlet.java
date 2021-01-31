package com.imooc.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(urlPatterns="/unused",loadOnStartup=2)
public class AnalysisServlet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("analysising DB");
	}

}

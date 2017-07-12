package com.apress.pss.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/hello" })
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = -7108628936470886786L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			resp.getWriter().write("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

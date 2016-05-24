package com.jeeTraining.sq.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sofiane.qartit
 * 
 */
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramAuteur = request.getParameter("auteur");
		String message = "Transmission de variables : OK ! " + paramAuteur;
		request.setAttribute("test", message);

		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp")
				.forward(request, response);
	}

}

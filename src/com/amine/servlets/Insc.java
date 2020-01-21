package com.amine.servlets;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amine.services.AbstractService;

/**
 * Servlet implementation class Test
 */
@WebServlet("/insc")
public class Insc extends HttpServlet  {
	
	@Inject
	AbstractService service;
	
	private static final long serialVersionUID = 1L;
    
	@Override
	public void init() {
	}
	
	@Override
	public void destroy() {

	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(service.getTest());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

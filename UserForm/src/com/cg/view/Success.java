package com.cg.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.User;

/**
 * Servlet implementation class Success
 */
@WebServlet("/Success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
	User userObj = new User();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User usr= (User)request.getAttribute("Userinfo");
		PrintWriter out = response.getWriter();
		out.print("<HTML>");
		out.println("<Head>");
		out.print("<Body>");
		out.print("<h1>Your Details are:</h1>");
		out.print("<h3>Name:"+usr.getName()+"</h3>");
		out.print("<h3>Age:"+usr.getAge()+"</h3>");
		out.print("<h3>Contact:"+usr.getContact()+"</h3>");
		out.print("</Body>");
		out.println("</Head>");
		
	}

}

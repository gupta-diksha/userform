package com.cg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.User;
import com.cg.service.ServiceImpl;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	User userObj = new User();
	ServiceImpl servObj = new ServiceImpl();
	List<String> errorList = new ArrayList<String>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		super.init(config);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("txtName");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		long contact = Long.parseLong(request.getParameter("txtContact"));
		if(servObj.validateName(name) && servObj.validateAge(age) && servObj.validateContact(contact))
		{
			userObj.setName(name);
			userObj.setAge(age);
			userObj.setContact(contact);
			request.setAttribute("Userinfo",userObj);
			RequestDispatcher rd = request.getRequestDispatcher("Success");
			rd.forward(request, response);
		}
		else if(!(servObj.validateName(name))) 
			errorList.add("Name cannot be empty!!");
		else if(!(servObj.validateAge(age)))
			errorList.add("Age cannot be less than zero or empty!!");
		else if(!(servObj.validateContact(contact)))
			errorList.add("Contact can only be of 10 digits with no special characters!!");
		else
		{
			request.setAttribute("Errorlist",errorList);
			RequestDispatcher rd = request.getRequestDispatcher("Failure");
			rd.forward(request, response);
		}
		
	}

}

package serveletproject9.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serveletproject9.dao.EmployeeDao;


public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String email=req.getParameter("email");
		 String pass=req.getParameter("pwd");
		 int id=Integer.parseInt(req.getParameter("id"));
		 PrintWriter printWriter=resp.getWriter();
		 EmployeeDao employeeDao=new EmployeeDao();
		 if(((employeeDao.login(id,email)).getPasswordS()).equals(pass)&&((employeeDao.login(id,email)).getEmail()).equals(email))
		 {
			resp.sendRedirect("https://www.google.com/");

		 }
		 else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.html");
			 requestDispatcher.forward(req, resp);
		}
	}
}

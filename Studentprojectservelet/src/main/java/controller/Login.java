package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;


public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String email=req.getParameter("email");
		 String pass=req.getParameter("password");
		 int id=Integer.parseInt(req.getParameter("id"));
		 String sname=req.getParameter("sname");
		 PrintWriter printWriter=resp.getWriter();
		 StudentDao studentDao=new StudentDao();
		 if(((studentDao.login(id,email)).getPasswordS()).equals(pass)&&((studentDao.login(id,email)).getEmail()).equals(email)&&((studentDao.login(id,email)).getSname()).equals(sname))
		 {
			resp.sendRedirect("https://stackoverflow.com/");

		 }
		 else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.html");
			 requestDispatcher.forward(req, resp);
		}
	}
}

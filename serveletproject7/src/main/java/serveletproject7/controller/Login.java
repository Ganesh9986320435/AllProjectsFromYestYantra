package serveletproject7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serveletproject7.dao.PersonDao;

public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String email=req.getParameter("email");
		 String pass=req.getParameter("pwd");
		 PersonDao personDao=new PersonDao();
		 PrintWriter printWriter=resp.getWriter();
		 if((personDao.login(email)).equals(pass))
		 {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("success.html");
			 requestDispatcher.forward(req, resp);	
		}
		 else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.html");
			 requestDispatcher.forward(req, resp);
		}
	}
}

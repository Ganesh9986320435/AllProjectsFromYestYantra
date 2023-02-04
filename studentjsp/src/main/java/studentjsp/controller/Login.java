package studentjsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentjsp.dao.StudentDao;
import studentjsp.dto.Student;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		StudentDao studentDao=new StudentDao();
		Student student= studentDao.login(email);
		if(student.getPass().equals(pass))
		{
			req.setAttribute("list", studentDao.getList());
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("display.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			req.setAttribute("message", "invalid pass or email");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}

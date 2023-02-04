package studentjsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentjsp.dao.StudentDao;
import studentjsp.dto.Student;

@WebServlet("/signin")
public class Controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student=new Student();
		student.setName(req.getParameter("name"));
		student.setFname(req.getParameter("fname"));
		student.setPhone(Long.parseLong(req.getParameter("phone")));
		student.setEmail(req.getParameter("email"));
		student.setPass(req.getParameter("pass"));
		ServletContext context=getServletContext();
		double fees= Double.parseDouble( context.getInitParameter("fees"));
		student.setFees(fees);
		StudentDao studentDao=new StudentDao();
		Student student2= studentDao.save(student);
		if(student2!=null)
		{
			req.setAttribute("message", "successfully signed in");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}

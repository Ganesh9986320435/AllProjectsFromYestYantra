package controller;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;

public class StudentController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String fname=req.getParameter("fname");
		String mname=req.getParameter("mname");
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		ServletContext context=getServletContext();
		String school=context.getInitParameter("school");
		long phone=Long.parseLong(req.getParameter("phone"));
		ServletConfig config=getServletConfig();
		long fess=Long.parseLong(config.getInitParameter("fees"));
		Student student=new Student();
		student.setName(name);
		student.setFname(fname);
		student.setMname(mname);
		student.setEmail(email);
		student.setPassword(password);
		student.setSchoolname(school);
		student.setFess(fess);
		student.setPhone(phone);
		StudentDao studentDao=new StudentDao();
		studentDao.save(student);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("Success.html");
		requestDispatcher.forward(req, resp);
	}
}

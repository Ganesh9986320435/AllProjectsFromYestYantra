package serveletproject9.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serveletproject9.dao.EmployeeDao;
import serveletproject9.dto.Employee;

public class EmployeeController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String sname=req.getParameter("sname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pwd");
		long phone=Long.parseLong(req.getParameter("phone"));
		Employee employee=new Employee();
		employee.setFname(fname);
		employee.setEmail(email);
		employee.setPass(pass);
		employee.setPhone(phone);
		employee.setSname(sname);
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.save(employee);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.html");
		requestDispatcher.forward(req, resp);
	}
}

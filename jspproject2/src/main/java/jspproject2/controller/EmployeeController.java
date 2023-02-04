package jspproject2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspproject2.dao.EmployeeDao;
import jspproject2.dto.Employee;
@WebServlet("/save")
public class EmployeeController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Employee employee=new Employee();
		employee.setName(name);
		employee.setAddress(address);
		employee.setEmail(email);
		employee.setPassword(password);
		EmployeeDao employeeDao=new EmployeeDao();
		Employee employee2=employeeDao.save(employee);
		if(employee2!=null)
		{
			req.setAttribute("message", "signed in successfully");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}

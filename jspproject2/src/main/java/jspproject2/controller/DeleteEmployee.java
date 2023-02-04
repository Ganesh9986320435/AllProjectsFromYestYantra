package jspproject2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspproject2.dao.EmployeeDao;
import jspproject2.dto.Employee;
@WebServlet("/delete")
public class DeleteEmployee extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		EmployeeDao employeeDao=new EmployeeDao();
		boolean b=employeeDao.delete(id);
		if(b)
		{
			List<Employee> list=employeeDao.employeeList();
			req.setAttribute("list", list);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("display.jsp");
			requestDispatcher.forward(req, resp);
		}
	
	
	
	
	}
}

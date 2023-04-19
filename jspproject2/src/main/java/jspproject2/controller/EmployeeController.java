package jspproject2.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

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
		Part part=req.getPart("image");
		InputStream iStream=part.getInputStream();
		byte[] data=new byte[iStream.available()];
		iStream.read(data);
		Employee employee=new Employee();
		employee.setName(name);
		employee.setAddress(address);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setImage(data);

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

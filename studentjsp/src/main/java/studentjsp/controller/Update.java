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

@WebServlet("/update")
public class Update extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		StudentDao studentDao=new StudentDao();
		Student student=studentDao.getInfo(email);
		if(student!=null)
		{
			req.setAttribute("student", student);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("edit.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}
}

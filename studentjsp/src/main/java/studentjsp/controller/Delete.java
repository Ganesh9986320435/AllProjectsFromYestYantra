package studentjsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import studentjsp.dao.StudentDao;
import studentjsp.dto.Student;

@WebServlet("/delete")
public class Delete extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		StudentDao studentDao=new StudentDao();
		boolean b=studentDao.delete(email);
		if(b)
		{
			List<Student> list=studentDao.getList();
			req.setAttribute("list", list);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("display.jsp");
			requestDispatcher.forward(req, resp);
		}

	}
}

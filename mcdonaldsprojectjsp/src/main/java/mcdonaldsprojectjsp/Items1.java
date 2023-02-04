package mcdonaldsprojectjsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mcdonaldsprojectjsp.dao.UserDao;

@WebServlet("/item")
public class Items1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		mcdonaldsprojectjsp.dto.Menu items=new UserDao().getSingleMenu(id);
		if(items!=null)
		{
			req.setAttribute("item", items);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("items.jsp");
			requestDispatcher.forward(req, resp);
		}
	
	
	
		}
}

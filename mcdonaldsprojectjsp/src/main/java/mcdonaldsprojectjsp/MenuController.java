package mcdonaldsprojectjsp;

import java.awt.Menu;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mcdonaldsprojectjsp.dao.UserDao;

@WebServlet("/menu")
public class MenuController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String desc=req.getParameter("desc");
		String offer=req.getParameter("offer");
		double price=Double.parseDouble(req.getParameter("price"));
		mcdonaldsprojectjsp.dto.Menu menu=new mcdonaldsprojectjsp.dto.Menu();
		menu.setIname(name);
		menu.setDesc(desc);
		menu.setOffer(offer);
		menu.setPrice(price);
		UserDao userDao=new UserDao();
		mcdonaldsprojectjsp.dto.Menu menu2=userDao.saveMenu(menu);
		if(menu2!=null)
		{
			List<mcdonaldsprojectjsp.dto.Menu> list=userDao.getMenu();
			req.setAttribute("list", list);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("menu1.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}
}

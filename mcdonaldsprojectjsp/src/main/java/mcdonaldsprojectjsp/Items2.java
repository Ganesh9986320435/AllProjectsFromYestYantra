package mcdonaldsprojectjsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mcdonaldsprojectjsp.dao.UserDao;
import mcdonaldsprojectjsp.dto.FoodOrder;
import mcdonaldsprojectjsp.dto.Items;
import mcdonaldsprojectjsp.dto.Menu;

@WebServlet("/items")
public class Items2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		Menu menu=new UserDao().getSingleMenu(id);
		Items items =new Items();
		items.setItemname(menu.getIname());
		items.setItemdesc(menu.getDesc());
		items.setItemoffer(menu.getOffer());
		items.setItemprice(menu.getPrice());
		items.setItemquantity(quantity);
		Items items2=new UserDao().savItems(items);
		FoodOrder foodOrder=new FoodOrder();
		foodOrder.setId(id);
		foodOrder.setFoodname(menu.getIname());
		
		foodOrder.se
		if(items2!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("");
			requestDispatcher.forward(req, resp);
		}
		
	}
}

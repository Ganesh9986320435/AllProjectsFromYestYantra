import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShopDao extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double a=0;
		Shop shop=new Shop();
		shop.setName(req.getParameter("name"));
		shop.setBrandg(req.getParameter("brand"));
		shop.setManu(req.getParameter("manu"));
		ServletContext servletContext=getServletContext();
		double d=Double.parseDouble(servletContext.getInitParameter("central"));
		ServletConfig servletConfig=getServletConfig();
		if(req.getParameter("place").equals("kar"))
		{
		a=Double.parseDouble(servletConfig.getInitParameter("kar"));
		}
		else 
		{
		a=Double.parseDouble(servletConfig.getInitParameter("tn"));
		}
		shop.setPrice(((Double.parseDouble(req.getParameter("price")))*(a+d))+Double.parseDouble(req.getParameter("price")));
		shop.setPlace(req.getParameter("place"));
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(shop);
		entityTransaction.commit();
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("Successfully added");
	}
}

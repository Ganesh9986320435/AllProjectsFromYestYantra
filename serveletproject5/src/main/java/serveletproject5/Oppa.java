package serveletproject5;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Oppa extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<html>" + "<body>" + "<h1>" + (num1+num2) + "</h1>" + "</body>" + "</html>");
		int num=req.getContentLength();
		System.out.println(num);
	}
}

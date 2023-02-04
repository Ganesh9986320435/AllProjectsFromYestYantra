package serveletproject7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import serveletproject7.dao.PersonDao;
import serveletproject7.dto.Person;

public class PersonController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=req.getParameter("fname");
		String sname=req.getParameter("sname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pwd");
		long phone=Long.parseLong(req.getParameter("phone"));
		Person person=new Person();
		person.setFnmae(fname);
		person.setSname(sname);
		person.setEmail(email);
		person.setPass(pass);
		person.setPass(pass);
		person.setPhone(phone);
		PersonDao personDao=new PersonDao();
		personDao.update(person);
		PrintWriter printWriter=res.getWriter();
		printWriter.print("success fully updated");
	}

}

package springMVC2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springMVC2.dao.Dao;
import springMVC2.dto.Employee;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private Dao dao;
	
	@RequestMapping("/request")
	public ModelAndView request()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", new Employee());
		modelAndView.setViewName("request.jsp");
		return modelAndView;
	}
	@RequestMapping("/save")
	public ModelAndView save(Employee employee)
	{
		ModelAndView modelAndView=new ModelAndView();
		dao.save(employee);
		List<Employee> list=dao.getall();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("display.jsp");
		return modelAndView;
	}	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam int id)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", dao.getbyid(id));
		modelAndView.setViewName("edit.jsp");
		return modelAndView;
	}
	@RequestMapping("/update")
	public ModelAndView update(@ModelAttribute Employee employee)
	{
		ModelAndView modelAndView=new ModelAndView();
		dao.update(employee);
		List<Employee> list=dao.getall();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("display.jsp");
		return modelAndView;
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id)
	{
		ModelAndView modelAndView=new ModelAndView();
		boolean b=dao.delete(id);
		if(b)
		{
			List<Employee> list=dao.getall();
			modelAndView.addObject("list", list);
			modelAndView.setViewName("display.jsp");
		}
		else {
			modelAndView.setViewName("home");
		}
		return modelAndView;
	}
	
	
}

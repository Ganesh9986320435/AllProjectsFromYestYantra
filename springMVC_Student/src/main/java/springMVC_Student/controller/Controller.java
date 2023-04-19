package springMVC_Student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springMVC_Student.dao.Dao;
import springMVC_Student.dto.Student;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private Dao dao;

	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", new Student());
		modelAndView.setViewName("register.jsp");
		return modelAndView;
	}

	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView();
		dao.save(student);
		modelAndView.addObject("list", dao.getAllStudents());
		modelAndView.setViewName("display.jsp");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView();
		boolean b = dao.delete(id);
		if (b) {
			modelAndView.addObject("list", dao.getAllStudents());
			modelAndView.setViewName("display.jsp");
		} else {
			modelAndView.setViewName("home.jsp");
		}
		return modelAndView;
	}

	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", dao.getbyid(id));
		modelAndView.setViewName("edit.jsp");
		return modelAndView;
	}

	@RequestMapping("/update")
	public ModelAndView update(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView();
		dao.update(student);
		modelAndView.addObject("list", dao.getAllStudents());
		modelAndView.setViewName("display.jsp");
		return modelAndView;
	}
}

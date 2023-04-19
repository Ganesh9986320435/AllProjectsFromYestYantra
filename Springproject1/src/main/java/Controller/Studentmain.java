package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import employee.Student;

public class Studentmain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		Student std=context.getBean("stu",Student.class);
		System.out.println(std);
		Student std1=context.getBean("stu",Student.class);
		System.out.println(std1);
	}
}

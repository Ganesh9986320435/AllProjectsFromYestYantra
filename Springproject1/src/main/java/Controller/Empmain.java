package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import employee.Employee;

public class Empmain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("property.xml");
		Employee employee=context.getBean("emp",Employee.class);
		employee.print();
	}
}

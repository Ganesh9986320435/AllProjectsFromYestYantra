package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Personmain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		Person person=context.getBean("add",Person.class);
		person.
	}
}

package dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
Person person=context.getBean("person",Person.class);
person.walk();
	}
}

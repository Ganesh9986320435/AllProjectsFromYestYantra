package springproject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("items.xml");
		Items items=context.getBean("item",Items.class);
		System.out.println(items);
	}
}

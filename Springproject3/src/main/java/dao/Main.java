package dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("item.xml");
		Pen item=context.getBean("pen",Pen.class);
		System.out.println(item.getCost());
	}
}



package dto2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dto1.Config;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Mobile mobile=context.getBean("mobile",Mobile.class);
		mobile.doing();
	}

}

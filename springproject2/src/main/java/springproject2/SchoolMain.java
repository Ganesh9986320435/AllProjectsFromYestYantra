package springproject2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SchoolMain {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("school.xml");
	School school=context.getBean("school",School.class);
	System.out.println(school);
//	System.out.println(school.student);
	Resource resource=new ClassPathResource("school.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	School school1=factory.getBean("school",School.class);
	System.out.println(school1);
	}
}

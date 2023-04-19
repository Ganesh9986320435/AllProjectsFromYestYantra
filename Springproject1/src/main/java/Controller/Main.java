package Controller;

import java.awt.datatransfer.ClipboardOwner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dto.Cow;
import Dto1.Gst;
import Dto1.Kargst;
import Dto1.Tngst;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("gst.xml");
		Gst gst=context.getBean("tn",Tngst.class);
		gst.clculate();
	}
}

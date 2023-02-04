package log4j;

import java.util.Scanner;

import org.apache.log4j.*;

public class PersonMain {
	static Logger logger=Logger.getLogger(PersonMain.class);
	static Layout layout=new PatternLayout("%d      %p     %m       %c      %M      %l %n");
	static Appender appender=new ConsoleAppender(layout);
	static Scanner scanner=new Scanner(System.in);
	static Person person=new Person();

	public static void main(String[] args) {
		logger.addAppender(appender);
		person.setBank("ICICI");
		person.setAccount_no(123456);
		person.setPass("123456");
		person.setBal(2000);
		int count=3;
		while(count>0)
		{
			System.out.println("enter the Accountno");
			long ai=scanner.nextLong();
			System.out.println("enter the pass");
			String pass=scanner.next();
			valuate(ai,pass);
			count--;
		}
		logger.warn("your account is blocked");

	}

	private static void valuate(long ai, String pass) {
		if(person.getAccount_no()==ai&&person.getPass().equals(pass))
		{
			logger.info("valid");
			balance();
			System.exit(0);
		}else {
			logger.debug("non valid");
		}
	}

	private static void balance() {
		logger.info(person.getBal());
	}
}

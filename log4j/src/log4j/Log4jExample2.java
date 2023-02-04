package log4j;

import org.apache.log4j.*;

public class Log4jExample2 {
	public static void main(String[] args) {
		
	Logger logger=Logger.getLogger(Log4jExample2.class);
	Layout layout=new PatternLayout("%d      %p     %m       %c      %M      %l %n");
	Appender appender=new ConsoleAppender(layout);
	logger.addAppender(appender);
	logger.info("hi");
	}
}

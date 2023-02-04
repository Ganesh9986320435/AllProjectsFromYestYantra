package log4j;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4jExample1 {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Log4jExample1.class);
		Layout layout=new SimpleLayout();
		Appender appender=new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.info("information method");
		logger.debug("debug message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
	}
}

package log4j1;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Simply {
	public static void main(String[] args) throws Exception {
		Logger logger=Logger.getLogger(Simply.class);
		Layout layout=new PatternLayout("%d %M");
		Appender appender=new FileAppender(layout,"C:/Users/Hp/Desktop/Log4j/example1.log");
		logger.addAppender(appender);
		logger.info("verified");
	}
}

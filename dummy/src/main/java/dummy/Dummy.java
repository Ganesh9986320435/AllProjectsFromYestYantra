package dummy;

import org.apache.log4j.Logger;

public class Dummy {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Dummy.class);
		logger.info("hi");
		logger.debug("kokok");
	}
}

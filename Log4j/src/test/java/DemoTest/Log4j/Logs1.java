package DemoTest.Log4j;

import org.apache.logging.log4j.*;

public class Logs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = LogManager.getLogger(Logs1.class);
		
		System.out.println("Hello this is Console message");
		System.out.println("Its my first log file");
	        log.info("This is an INFO message");
	        log.warn("This is a WARNING");
	        log.error("This is an ERROR");
	        log.debug("This is a DEBUG message");
	    }
	

}

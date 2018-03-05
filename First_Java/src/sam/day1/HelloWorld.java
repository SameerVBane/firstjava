package sam.day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.log(Level.INFO, "Hello World!!!");
		}
}




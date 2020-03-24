package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo
{
	private static Logger logger = LogManager.getLogger(log4jDemo.class);
	public static void main(String[] args) 
	{
		System.out.println("This is my first log4j script");
		
		logger.info("This is information message");
		logger.error("This is Error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		System.out.println("First log4j script completed successfully");
	}

}

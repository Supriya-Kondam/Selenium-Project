package Classes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Logsscript {
	
	Logger logger=LogManager.getLogger(Logsscript.class); //this instance we are saying will use loggers fro this class
	
	@Test
	void Logger()
	{
		System.out.println("This is supriya");
	logger.info("name executed successfuly");
	
	}
	}
	
	

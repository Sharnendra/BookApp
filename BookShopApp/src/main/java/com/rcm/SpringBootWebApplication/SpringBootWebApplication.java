package com.rcm.SpringBootWebApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer{

	private static final Logger LOGGER = LogManager.getLogger(SpringBootApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Application Started...------------------------- Medicare App");
		SpringApplication.run(SpringBootWebApplication.class, args);
		LOGGER.info("Application Initialization Completed...------------------------- Medicare App");
        LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
	}
}

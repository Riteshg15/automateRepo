package com.jbk;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class SampleAdmin {
	static Logger log=Logger.getLogger("SampleAdmin.class");
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("SampleAdmin info message");
	
		
	}

}

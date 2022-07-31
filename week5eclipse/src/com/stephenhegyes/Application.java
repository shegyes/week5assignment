package com.stephenhegyes;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		
		logger.error("Hello");
		
		logger logger1 = new SpacedLogger();
		
		logger1.log("Hello");
		
		logger1.error("Hello");

	}

}

package com.stephenhegyes;

public class AsteriskLogger implements logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		System.out.println("******************");
		System.out.println("***Error: " + error + "***");
		System.out.println("******************");
		
	}
	
}

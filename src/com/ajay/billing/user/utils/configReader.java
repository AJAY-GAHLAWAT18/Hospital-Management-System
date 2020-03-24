package com.ajay.billing.user.utils;

import java.util.ResourceBundle;

public interface configReader {
	String BROWSE_PATH="browsepath";
	String USERID = "userid";
	String PWD = "password";
	String DBURL ="dburl";
	String DRIVER = "driver";
	 ResourceBundle rb = ResourceBundle.getBundle("config");
	public static String getvalue(String key) {
		return rb.getString(key);             //Gets a string array for the given key from this resource bundle or one of its parents.      
	}

}

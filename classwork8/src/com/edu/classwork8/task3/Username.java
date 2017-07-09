package com.edu.classwork8.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

	public static void main(String[] args) {
		
		Pattern p2 = Pattern.compile("^[0-9A-z_]{3,15}$");
		
	    String[] username = {"tiktak_96", "pantera100%", "buterbrod_z_ketchupom", 
	    					"NaviCommand", "Terminator!"};
	    
	    for (int i = 0; i < username.length; i++) {
	    	Matcher m2 = p2.matcher(username[i]);
	    	if (m2.matches()) {
	    		System.out.println("Username \"" + username[i] + "\" is valid.");
	    	} else {
	    		System.out.println("Username \"" + username[i] + "\" is invalid.");
	    	}
		}

	}

}

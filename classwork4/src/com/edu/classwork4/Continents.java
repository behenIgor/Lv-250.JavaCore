package com.edu.classwork4;

public class Continents {
	
	public enum Continent{
		Europe, Asia, Africa, IDontKnowThisCountry;
		
	}

	public static void main(String[] args) {
		System.out.println(getContinent("ukraine"));

	}
	
	public static Continent getContinent(String country) {
		switch (country.toLowerCase()) {
		
		case "ukraine": case "france": 
			return Continent.Europe;
		
		case "russia": case "china": 
			return Continent.Asia;
			
		case "egypt": case "nigeria": 
			return Continent.Africa;
			
		}
		return Continent.IDontKnowThisCountry;
	}

}

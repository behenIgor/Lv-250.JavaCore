package com.edu.classwork4;

public class DayOfWeek {

	public static void main(String[] args) {
		DayOfWeek dayofweek = new DayOfWeek();
		dayofweek.printDayOfWeek(5);
	}
	
	private void printDayOfWeek(int day) {
		switch (day) {
		
		case 1:
			System.out.println("Monday, lunedi, lundi.");
			break;
			
		case 2:
			System.out.println("Tuesday, martedi, mardi.");
			break;
			
		case 3:
			System.out.println("Wednesday, mercoledi, mercredi.");
			break;

		case 4:
			System.out.println("Thursday, gioved, jeudi");
			break;
			
		case 5:
			System.out.println("Friday, venerdi, vendredi.");
			break;
			
		case 6:
			System.out.println("Saturday, sabato, samedi");
			break;
			
		case 7:
			System.out.println("Sunday, domenica, dimanche.");
			break;
			
		default:
			System.out.println("No this day.");
			System.exit(0);
		}
	}
}

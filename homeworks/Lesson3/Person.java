package second.homework;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.imageio.IIOException;

class Person{
	private String name;
	private int birthYear;
	
	public Person(){}
	public Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getBirthYear(){
		return birthYear;
	}
	public void setBirthYear(int birthYear){
		this.birthYear = birthYear;
	}
	
	public void changeName(String name){
		this.name = name;
	}
	public int age(){
		GregorianCalendar calendar = new GregorianCalendar();
		return calendar.get(Calendar.YEAR) - this.birthYear;
	}
	public void input() throws IIOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Input name of person");
		this.name = in.nextLine();
		System.out.println("Input the birthday year \n");
		this.birthYear = in.nextInt();
	}
	public void output() {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.printf("Name \t\t\t%s %nAge \t\t\t%d %nThe birthday year \t%d%n%n",
				this.name,calendar.get(Calendar.YEAR) - this.birthYear,this.birthYear);
	}
}

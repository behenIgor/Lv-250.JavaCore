import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	//Fields
	private String name;
	private int birthYear;
	
	//Access properties 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	//Constructors
	public Person() {}
	public Person(String name, int birthYear)
	 {
		this.name = name;
		this.birthYear = birthYear;
		
	 }
	
	//Methods
	public int age(int currentYear)
	{
		return currentYear-birthYear;
	}
	public void input () throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input name of the person");
		this.name = br.readLine();
		System.out.println("Input the birthday year of the person");
		this.birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output (int age)
	{
	System.out.println("Name " + name + "age " + age);
	}
	
	public void changeName (String name)
	{
		this.name = name;
	}
	
}

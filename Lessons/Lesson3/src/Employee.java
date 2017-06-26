
public class Employee {

	//Fields
	private String name;
	private double rate;
	private double hours;
	static private double totalSum;
	
	
	
	
	//Access properties
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public static double getTotalSum() {
		return totalSum;
	}
	public static void setTotalSum(double totalSum) {
		Employee.totalSum = totalSum;
	}
	
	//Constructors
	public Employee(){}
	public Employee(String name, double rate)
	{
	    this.name = name;
	    this.rate = rate;
	}
	public Employee(String name, double rate, double hours)
	{
	    this.name = name;
	    this.rate = rate;
	    this.hours = hours;
	}	
	//Methods
	public double salary()
	{
		
		return rate*hours;
	}
	
@Override
public String toString() {
return "Employee name=" + name + ", rate=" + rate + ",hours= " + hours ;
}

public void changeRate (double rate)
{
  this.rate = rate;	
}

public double bonuses(double salary)
{
   return salary*10/100; 	
}
}

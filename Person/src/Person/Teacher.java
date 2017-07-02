package Person;

public class Teacher extends Staff {
	private static final String TYPE_PERSON = "Teacher";
	int salary;	

	public Teacher(int salary) {
		super();
		this.salary = salary;
	}
	
	public static String getTypePerson() {
		return TYPE_PERSON;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}

	void salary() {
		System.out.println("My salary " + salary);
	}

}

package Person;

public class Student  extends Person{	
	private static final String TYPE_PERSON = "Student";

	public static String getTypePerson() {
		return TYPE_PERSON;
	}
	
	void print(){
		System.out.println("I am a " + TYPE_PERSON);
	}

}

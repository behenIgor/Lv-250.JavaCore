package Person;

public class Main {

	public static void main(String[] args) {
		Person[] persons = new Person[6];

		persons[0] = new Student();
		persons[1] = new Student();
		persons[2] = new Cleaner(150);
		persons[3] = new Teacher(300);
		persons[4] = new Teacher(125);
		persons[5] = new Cleaner(115);

		for (Person pers : persons) {
			pers.print();
			if (pers instanceof Staff)
				((Staff) pers).salary();
		}
	}
}

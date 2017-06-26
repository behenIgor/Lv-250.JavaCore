package second.homework;

public class Main {

	public static void main(String[] args) {
		Person pers1 = new Person("Ruslan",1995);
		Person pers2 = new Person("Oksana",1994);
		Person pers3 = new Person("Stepan",1992);
		Person pers4 = new Person("Olena",1998);
		Person pers5 = new Person();
		pers5.setName("Bogdan");
		pers5.setBirthYear(2003);
		
		pers1.output();
	}
}

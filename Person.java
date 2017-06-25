import javax.swing.event.PopupMenuListener;

public class Person {
private String name;
static int birthYear;


public Person () {
}

public Person(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
}

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
public static  int getAge() {
	return (2007 - birthYear);
}
public void changeName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Person name is " + name + ", age is " + birthYear;
}

}

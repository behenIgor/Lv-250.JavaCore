package Task3;

import java.util.Comparator;

public class Student implements Comparator {
	private static String name = null;
	static int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Student.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;

	}

	public Student(int course, String name) {
		this.name = name;
		this.course = course;
	}

	static Student nameComparator = new Student(course, name);

	public static Comparator getNameComparator() {
		return (Comparator) nameComparator;
	}

	public int compare(Object s1, Object s2) {
		return ((Student) s1).name.compareTo(((Student) s2).name);
	}

	@Override
	public String toString() {
		return "Student name is " + name + ", course is " + course + "\n";
	}
}

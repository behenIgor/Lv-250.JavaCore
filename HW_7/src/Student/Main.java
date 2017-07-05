package Student;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Anna", 1));
		students.add(new Student("Petya", 2));
		students.add(new Student("Kolya", 2));
		students.add(new Student("Inna", 3));
		students.add(new Student("Evey", 1));

		System.out.println(students);

		Collections.sort(students, new NameComparator());
		System.out.println(students);

		Collections.sort(students, new CourseComparator());
		System.out.println(students);

	}

}
//students ordered by name
class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
}
//students ordered by course
class CourseComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return a.getCourse() < b.getCourse() ? -1 : a.getCourse() == b.getCourse() ? 0 : 1;
	}
}

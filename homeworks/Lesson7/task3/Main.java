package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Ruslan",5));
		students.add(new Student("Anastasiya",5));
		students.add(new Student("Ivan",3));
		students.add(new Student("Anna",3));
		students.add(new Student("Nazar",2));
		students.add(new Student("Olya",1));
		
		Student.printStudents(students, 5);
		
		Collections.sort(students, new NameComparator());	
		System.out.println();
		for (Student st : students) {
			System.out.println(st);
		}
		
		Collections.sort(students, new CourseComparator());	
		System.out.println();
		for (Student st : students) {
			System.out.println(st);
		}
	}
}


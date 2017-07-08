package task3;

import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;
	
	public Student() { }
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
	
	@Override
	public String toString() {
		return "[name=" + name + ", course=" + course + "]";
	}
	static public void printStudents(List<Student> students, Integer cours) {
		for (Iterator i = students.iterator(); i.hasNext();) {
			Student stud = (Student)i.next();
			if(stud.getCourse() == cours) {
				System.out.println(stud);
			}
		}
	}
}

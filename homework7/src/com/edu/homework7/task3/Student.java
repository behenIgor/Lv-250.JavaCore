package com.edu.homework7.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class Student {

	public static void main(String[] args) {
		
		ArrayList <Student> student = new ArrayList <Student> ();
		student.add(new Student("Max", 17));
		student.add(new Student("Ira", 88));
		student.add(new Student("Petro", 15));
		student.add(new Student("Mykola", 88));
		student.add(new Student("Viktor", 5));
		
		System.out.println("Students, which are taught in the course 88:");
		printStudents(student, 88);
		
		System.out.println("\nStudents, ordered by name:");
		student.sort(new NameComparator());
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i));
		}
		
		
		System.out.println("\nStudents, ordered by course:");
		student.sort(new CourseComparator());
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i));
		}

	}
	
	private String name;
	private int course;
	
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
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	static private void printStudents(ArrayList <Student> arrayList, int course) {
		ListIterator <Student> it = arrayList.listIterator();
		
		while (it.hasNext()) {
			if (it.next().getCourse() == course) {
				System.out.println(it.previous().getName());
				it.next();
			}
		}
			
	}
	
	@Override
	public String toString() {
		return ("Name - " + name + ". Course - " + course);
	}
	
	static class NameComparator implements Comparator <Object> {
		public int compare(Object o1, Object o2) {
		    return ((Student)o1).getName().compareTo(((Student)o2).getName());
		  }
		}

	static class CourseComparator implements Comparator <Object> {
		  public int compare(Object o1, Object o2) {
		    return ((Student)o1).getCourse() - (((Student)o2).getCourse());
		  }
		}

	
}



package Task3;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class main {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student(1, "Oksana"));
		student.add(new Student(2, "Oleg"));
		student.add(new Student(4, "Igor"));
		student.add(new Student(4, "Petro"));
		student.add(new Student(5, "Victor"));
		
		System.out.println(student);
		
		Iterator<Student> s = student.iterator();
		 
	    while(s.hasNext()) {
	      Student st = s.next();
	      System.out.println(st);
	    }
	

	  
			Set<Student> student1 = new TreeSet(Student.getNameComparator());
			 student1.addAll(student);
			 System.out.println(student1);
			 
	    	}

		
	}



package task3;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
	    
	@Override
	public int compare(Student st1, Student st2) {
		return st1.getCourse() - st2.getCourse();
	}
}
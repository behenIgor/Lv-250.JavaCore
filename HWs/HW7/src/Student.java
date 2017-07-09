import java.util.Iterator;
import java.util.List;


public class Student {

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
    public Student(){}
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public void printStudents(List<Student> students, int course) {

		Iterator<Student> iter = students.iterator();
     System.out.println("The students, which are taught on this course ");
		while (iter.hasNext()) {
			Student str = iter.next();

			if (str.course ==course)
			{
				System.out.println(str.name);
			}
		}
	    }

	

	@Override
	public String toString() {
		return "Student [name=" + name + ",course=" + course + "]";

	}
}
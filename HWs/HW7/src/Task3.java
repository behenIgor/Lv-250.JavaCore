import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st  =new Student();
		List<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student("Nazar",1));
		stud.add(new Student("Oleg",1));
		stud.add(new Student("Max",1));
		stud.add(new Student("Alex",4));
		stud.add(new Student("Petro",5));
		
		
		st.printStudents(stud, 1);
		
		
		System.out.println("Odered by name");
		
		stud.sort(new NameComparator());
        for (Student s : stud) {
            System.out.println(s);
        }
        System.out.println("Odered by course");
        stud.sort(new courseComparator());
        for (Student s1 : stud) {
            System.out.println(s1);
        }
        
        
        
        
	}

}

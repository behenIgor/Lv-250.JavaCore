package task04_07.hw;

import java.util.*;

/**
 * Created by User on 05.07.2017.
 */
public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Anna", 1));
        students.add(new Student("Petya", 2));
        students.add(new Student("Kolya", 2));
        students.add(new Student("Inna", 3));
        students.add(new Student("Evey", 1));

       // System.out.println(students);
        Collections.sort(students, new Student.CourseComparator());
       // System.out.println(students);

        Set set = new TreeSet(new Student.NameComparator());
        set.addAll(students);
       // System.out.println(set);

        printStudents(students,3);
    }
    public static void printStudents (List students, Integer course){
        Iterator<Student> it = students.iterator();
        Student s;
        while (it.hasNext()){
            s = it.next();
            if(s.getCourse() == course)
                System.out.println(s);
        }
    }
}

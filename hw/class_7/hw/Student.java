package task04_07.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 05.07.2017.
 */
public class Student {
    private String name;
    private int course;
    private NameComparator nameComparator = new NameComparator();
    private CourseComparator courseComparator = new CourseComparator();

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public NameComparator getNameComparator() {
        return nameComparator;
    }

    public void setNameComparator(NameComparator nameComparator) {
        this.nameComparator = nameComparator;
    }

    public CourseComparator getCourseComparator() {
        return courseComparator;
    }

    public void setCourseComparator(CourseComparator courseComparator) {
        this.courseComparator = courseComparator;
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
        return  "name = " + name + '\'' +
                " course = " + course;
    }
    static class NameComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    static class CourseComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getCourse() < o2.getCourse() ? -1 : o1.getCourse() < o2.getCourse() ? 1 : 0;
        }
    }
}






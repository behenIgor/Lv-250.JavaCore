package new30_06;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Student extends Person {

    private String name;
    final String TYPE_PERSON = "Student";

    public Student(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
}

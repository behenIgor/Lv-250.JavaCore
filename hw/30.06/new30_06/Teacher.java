package new30_06;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Teacher extends Staff {

    private String name;
    final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + this.getName());
    }

    @Override
    public int salary() {
        return 6000;
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

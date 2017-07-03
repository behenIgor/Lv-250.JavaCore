package new30_06;

/**
 * Created by Вождь on 01.07.2017.
 */
public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {new Student("Jessika"), new Teacher("Mariia Ivanivna"),
                new Cleaner("Sergiy"), new Student("Jes"), new Teacher("Ostap Romanovych")};

        for (int i = 0; i <persons.length ; i++) {
            persons[i].print();
            if(persons[i] instanceof Staff)
                ((Staff)persons[i]).salary();

        }
    }
}

package New23;

/**
 * Created by Вождь on 23.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Olja",5,76);
        Employee e2 = new Employee("Julja",9,46);
        Employee e3 = new Employee("Anja",4,49);

        System.out.println("Total hours of all workers:" + (e.getHours()+e2.getHours()+e3.getHours()));


    }
}

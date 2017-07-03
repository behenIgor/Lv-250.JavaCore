package home2;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[4];
        employee[0] = new Teacher(7000, "2366437657");
        employee[1] = new Teacher(6500, "6566498657");
        employee[2] = new Operator(26, 300, "2369364957");
        employee[3] = new Operator(30, 200, "9256437659");


        int salary;
        Employee emp = null;
        for (int i = 0; i < employee.length-1 ; i++) {
            for (int j = i+1; j <employee.length ; j++) {

            }
        }

    }
}

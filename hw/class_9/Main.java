package task07_07.lesson.lesson2;

/**
 * Created by User on 08.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Plants pl = new Plants(5, "Blue", "rose");
            System.out.println(pl);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }

    }
}

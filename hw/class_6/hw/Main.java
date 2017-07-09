package home;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};

        for(Bird b: birds){
            System.out.println(b.fly());
            System.out.println(b);
        }
    }
}

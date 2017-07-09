package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вождь on 20.06.2017.
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name and age?");
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Where are you live, " + name);
        String address = reader.readLine();

        reader.close();

        System.out.println("Name is " + name + ", " + "age is " + age);
        System.out.println("Address: " + address);

    }
}

package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вождь on 20.06.2017.
 */
public class Phone {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input call price in $");

        System.out.println("first price:");
        int c1 = Integer.parseInt(reader.readLine());

        System.out.println("second price:");
        int c2 = Integer.parseInt(reader.readLine());

        System.out.println("third price:");
        int c3 = Integer.parseInt(reader.readLine());

        System.out.println("Input call time in minute");

        double t1 = Double.parseDouble(reader.readLine());
        double t2 = Double.parseDouble(reader.readLine());
        double t3 = Double.parseDouble(reader.readLine());

        reader.close();

        System.out.println("First call price: " + c1*t1 + "$");
        System.out.println("Second call price: " + c1*t1 + "$");
        System.out.println("Third call price: " + c1*t1 + "$");

        System.out.println("All price together: " + (c1*t1+c2*t2+c3*t3));

    }
}

package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вождь on 20.06.2017.
 */
public class Circle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double radius = Double.parseDouble(reader.readLine());

        reader.close();

        System.out.println("perimeter = " + 2*Math.PI*radius);
        System.out.println("area  = " + Math.PI*Math.pow(radius,2) );
    }
}

package task07_07.lesson.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 09.07.2017.
 */
public class DivMain {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        try {
            a = Double.parseDouble(reader.readLine());
            b = Double.parseDouble(reader.readLine());
        }catch (IOException i){}

        System.out.println(div(a, b));
    }
    public static double div(double a, double b){
        double c = 0;
        try {
            c = a/b;
        }catch (ArithmeticException w){
            System.err.println(w);
        }

        return c;
    }
}

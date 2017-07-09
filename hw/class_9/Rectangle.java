package task07_07.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 07.07.2017.
 */
public class Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        }catch (NumberFormatException e){
            System.err.println(e);
        }
        try {
            System.out.println(squareRectangle(a, b));
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
        }

    }
    public static int squareRectangle (int a, int b) throws ArithmeticException{
        if(a <= 0 | b <= 0)
            throw new ArithmeticException();
        return a*b;
    }
}

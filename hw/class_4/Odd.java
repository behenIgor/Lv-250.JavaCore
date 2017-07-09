package new27_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вождь on 27.06.2017.
 */
public class Odd {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int count = 0;

        if(a%2 == 0 && b%2 == 0 && c%2 == 0) {
            System.out.println("a,b,c are even");
        }
        else {
            if (a % 2 == 0)
                System.out.println("a is even");
            else {System.out.println("a is odd"); count++;}
            if (b % 2 == 0)
                System.out.println("b is even");
            else {System.out.println("b is odd"); count++;}
            if (c % 2 == 0)
                System.out.println("c is even");
            else {System.out.println("c is odd"); count++;}
        }

        if(count == 1)
        System.out.println(count + " number is odd ");
        else
            System.out.println(count + " numbers are odd");
    }
}

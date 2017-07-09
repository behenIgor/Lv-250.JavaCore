package new27_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вождь on 27.06.2017.
 */
public class TaskB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if(num >= num2 && num >=num3)
            System.out.println(num + " is max");
        else if(num2 >= num && num2 >= num3)
            System.out.println(num2 + " is max");
        else if(num3 >= num && num3 >= num2)
            System.out.println(num3 + " is max");

        if(num <= num2 && num <=num3)
            System.out.println(num + " is min");
        else if(num2 <= num && num2 <= num3)
            System.out.println(num2 + " is min");
        else if(num3 <= num && num3 <= num2)
            System.out.println(num3 + " is min");


    }
}

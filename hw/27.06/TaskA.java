package new27_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вождь on 27.06.2017.
 */
public class TaskA {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float a = Float.parseFloat(reader.readLine());
        float b = Float.parseFloat(reader.readLine());
        float c = Float.parseFloat(reader.readLine());

        if(a>=-5 && a<=5)
            System.out.println("a [-5,5]");
        if(b>=-5 && b<=5)
            System.out.println("b [-5,5]");
        if(c>=-5 && c<=5)
            System.out.println("c [-5,5]");
    }
}

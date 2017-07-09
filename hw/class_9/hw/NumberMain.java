package task07_07.lesson.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 09.07.2017.
 */
public class NumberMain {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input start: ");
        try {
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Input end: ");
            int b = Integer.parseInt(reader.readLine());
            System.out.println("and now input your number");
            int n = Integer.parseInt(reader.readLine());
        }catch (NumberFormatException e){
            System.err.println(e);
        }

        n.readNamber(a, b);


    }
    public static int readNumber(int start, int end) throws IOException {

            if (this >= start && this <= end)
                return this;
            return 0;
    }
    public static void main(){
        readNumber(1, 100);

    }
}

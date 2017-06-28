package new27_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вождь on 27.06.2017.
 */
public class Week {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if(num ==1)
            System.out.println("Понеділок Понедельник Monday");
        else if(num == 2)
            System.out.println("Вівторок Вторник Tuesday");
        else if(num == 3)
            System.out.println("Середа Среда Wednesday");
        else if(num == 4)
            System.out.println("Четвер Четверг Thursday");
        else if(num == 5)
            System.out.println("П'ятниця Пятница Friday");
        else if(num == 6)
            System.out.println("Субота Субота Saturday");
        else if(num == 7)
            System.out.println("Неділя Воскресенье Sunday");

    }
}

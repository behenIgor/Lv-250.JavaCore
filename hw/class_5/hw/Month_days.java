package new29;

import java.util.Scanner;

/**
 * Created by Вождь on 29.06.2017.
 */
public class Month_days {
    public static void main(String[] args) {

        int [] month_days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month");
        while (true) {
            String s = scanner.nextLine();
            if(s.equals(" "))
                break;
            int number = Integer.parseInt(s);
            System.out.println(month_days[number]);
        }
        scanner.close();
    }
}
